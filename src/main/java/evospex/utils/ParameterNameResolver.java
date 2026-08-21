package evospex.utils;

import evospex.expression.Expr;
import evospex.expression.symbol.ExprName;
import soot.G;
import soot.Local;
import soot.Scene;
import soot.SootClass;
import soot.SootMethod;
import soot.options.Options;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

/**
 * Resolves EvoSpex's internal "arg0", "arg1", ... labels back to the target method's real
 * parameter names, read from the compiled class's debug info via Soot.
 *
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class ParameterNameResolver {

  /**
   * The most recently resolved arg-name map, shared globally for the duration of a run so that
   * any code rendering an expression for display (e.g. SpecChromosome.printGenes(), called deep
   * inside the fitness function) can substitute real parameter names without needing this map
   * threaded through its call chain. Defaults to empty (no-op substitution) until resolved.
   */
  public static Map<String, String> ARG_NAMES = Collections.emptyMap();

  /**
   * Renders an expression for display, substituting real parameter names for EvoSpex's internal
   * "arg0", "arg1", ... labels wherever ARG_NAMES has a mapping.
   */
  public static String render(Expr expr) {
    String text = expr.toString();
    for (Map.Entry<String, String> e : ARG_NAMES.entrySet()) {
      text = text.replaceAll("\\b" + e.getKey() + "\\b", Matcher.quoteReplacement(e.getValue()));
    }
    return text;
  }

  /**
   * Returns a map from "arg0", "arg1", ... to the real parameter name, or an empty map if the
   * target method can't be resolved unambiguously from the given states base folder name.
   */
  public static Map<String, String> resolveArgNames(Class<?> targetClass, String baseFolderName) {
    ParsedSignature parsed = parseFolderSegment(lastPathSegment(baseFolderName));
    if (parsed == null || parsed.paramTypesCsv.isEmpty()) return Collections.emptyMap();

    G.reset();
    Options.v().set_prepend_classpath(true);
    Options.v().set_allow_phantom_refs(true);
    Options.v().set_soot_classpath(System.getProperty("java.class.path"));
    Options.v().setPhaseOption("jb", "use-original-names:true");
    SootClass sootClass = Scene.v().loadClassAndSupport(targetClass.getName());
    sootClass.setApplicationClass();
    Scene.v().loadNecessaryClasses();

    List<SootMethod> candidates = new ArrayList<>();
    for (SootMethod m : sootClass.getMethods()) {
      String typesCsv = m.getParameterTypes().stream().map(Object::toString)
          .collect(Collectors.joining(","));
      if (typesCsv.equals(parsed.paramTypesCsv)) candidates.add(m);
    }
    SootMethod chosen = selectUnambiguous(candidates, parsed.bestEffortMethodName);
    if (chosen == null) {
      System.out.println("Could not unambiguously resolve parameter names for "
          + targetClass.getName() + " - keeping arg0/arg1/... labels.");
      return Collections.emptyMap();
    }

    List<Local> paramLocals = chosen.retrieveActiveBody().getParameterLocals();
    Map<String, String> result = new LinkedHashMap<>();
    for (int i = 0; i < paramLocals.size(); i++) {
      result.put(ExprName.getArgLabel(i), paramLocals.get(i).getName());
    }
    return result;
  }

  /**
   * Picks the single unambiguous candidate: the only one, or, when several share the same
   * parameter types, the one whose name matches the best-effort parsed method name. Returns
   * null if the candidates can't be narrowed down to exactly one.
   */
  private static SootMethod selectUnambiguous(List<SootMethod> candidates, String bestEffortMethodName) {
    if (candidates.size() == 1) return candidates.get(0);
    if (candidates.size() > 1 && bestEffortMethodName != null) {
      List<SootMethod> byName = candidates.stream()
          .filter(m -> m.getName().equals(bestEffortMethodName))
          .collect(Collectors.toList());
      if (byName.size() == 1) return byName.get(0);
    }
    return null;
  }

  /**
   * Parses a states folder segment of the form "_<returnType>_<methodName>(<type1>,<type2>,...)"
   * (see StateSerializer.formatFolderName) into its parameter-type CSV (parsed exactly) and a
   * best-effort method name (found by splitting on the first '_', which is unambiguous only
   * when the method name itself contains no underscores).
   */
  private static ParsedSignature parseFolderSegment(String segment) {
    if (segment == null) return null;
    String noLeadingUnderscore = segment.startsWith("_") ? segment.substring(1) : segment;
    int openParen = noLeadingUnderscore.indexOf('(');
    if (openParen < 0 || !noLeadingUnderscore.endsWith(")")) return null;
    String beforeParen = noLeadingUnderscore.substring(0, openParen);
    String paramTypesCsv = noLeadingUnderscore.substring(openParen + 1, noLeadingUnderscore.length() - 1);
    int firstUnderscore = beforeParen.indexOf('_');
    String bestEffortMethodName = firstUnderscore >= 0 ? beforeParen.substring(firstUnderscore + 1) : null;
    return new ParsedSignature(bestEffortMethodName, paramTypesCsv);
  }

  /**
   * Returns the last '/'-separated segment of the given path, ignoring a trailing slash.
   */
  private static String lastPathSegment(String path) {
    if (path == null) return null;
    String trimmed = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
    int lastSlash = trimmed.lastIndexOf('/');
    return lastSlash >= 0 ? trimmed.substring(lastSlash + 1) : trimmed;
  }

  private static class ParsedSignature {
    final String bestEffortMethodName;
    final String paramTypesCsv;

    ParsedSignature(String bestEffortMethodName, String paramTypesCsv) {
      this.bestEffortMethodName = bestEffortMethodName;
      this.paramTypesCsv = paramTypesCsv;
    }
  }

}
