package evospex.target;

import org.jgrapht.graph.DirectedPseudograph;
import evospex.utils.JavaClassesUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * Represents to type graph of a class under analysis
 * The type graph contains one node for each type that is reachable through
 * the fields of the current cut, and there is a link labeled with l from node n1 to node n2
 * iff there is an attribute l that goes from the type represented by n1 to the type
 * represented by n2.
 */
public class TypeGraph {

  protected DirectedPseudograph<Class<?>, TypeGraphEdge> graph; // The actual graph

  /**
   * Constructor
   * @param cut is the cut under analysis
   */
  public TypeGraph(Class<?> cut) {
    if (cut == null)
      throw new IllegalArgumentException("The CUT can't be null");
    graph = new DirectedPseudograph<>(TypeGraphEdge.class);
    buildGraph(cut, new HashSet<>());
  }

  /**
   * Recursively build the graph from the cut.
   * @param cut is the cut under analysis.
   * @param visited contains the name of the already visited classes.
   */
  private void buildGraph(Class<?> cut, Set<String> visited) {
    if (visited.add(cut.getName())) {
      if (!cut.getName().contains("java.util") && !java.lang.Error.class.isAssignableFrom(cut)) {
        // Only visit the fields of non java util classes
        // and that are not instances of java.lang.Error
        graph.addVertex(cut);
        // Get the fields of the given type
        Set<Class<?>> to_visit = new HashSet<>();
        List<Field> fields = getAllFields(new LinkedList<>(), cut);
        for (Field fld : fields) {
          if (!Modifier.isStatic(fld.getModifiers())) {
            // For each non static field
            String fld_decl_name = fld.getName();
            Class<?> fld_type = formatClass(fld.getType());
            graph.addVertex(fld_type);
            graph.addEdge(cut, fld_type, new TypeGraphEdge(fld_decl_name));
            to_visit.add(fld_type);
          }
        }
        for (Class<?> cls : to_visit) {
          // Visit fields only for non-primitive types for now
          if (!cls.isPrimitive() && !JavaClassesUtils.isNumber(cls))
            buildGraph(cls, visited);
        }
      }
    }
  }

  /**
   * Format the given class, i.e., if it represents a basic type (such as int) return the corresponding non-basic type.
   * @param c is the class to format
   * @return the corresponding non basic type
   */
  private Class<?> formatClass(Class<?> c) {
    if (c.isPrimitive()) {
      if (c.equals(int.class))
        return Integer.class;
      if (c.equals(float.class))
        return Float.class;
      if (c.equals(double.class))
        return Double.class;
      if (c.equals(boolean.class))
        return Boolean.class;
      if (c.equals(long.class))
        return Long.class;
      throw new IllegalArgumentException("Don't know how to format class "+c.getSimpleName());
    }
    return c;
  }

  /**
   * Returns the edges of the given vertex class
   */
  public Set<TypeGraphEdge> getOutgoingEdges(Class<?> vertexClass) {
    return graph.outgoingEdgesOf(vertexClass);
  }

  /**
   * Get the target vertex of the given edge
   */
  public Class<?> getTargetVertex(TypeGraphEdge edge) {
    return graph.getEdgeTarget(edge);
  }

  /**
   * Get the edge with the given label name
   */
  public TypeGraphEdge getEdgeFromLabel(String label) {
    for (TypeGraphEdge edge : graph.edgeSet()) {
      if (edge.getLabel().equals(label))
        return edge;
    }
    throw new IllegalArgumentException("Invalid label: "+label);
  }

  /**
   * Get all fields from the CUT (even the inherited ones)
   */
  private List<Field> getAllFields(List<Field> fields, Class<?> cut) {
    fields.addAll(Arrays.asList(cut.getDeclaredFields()));
    if (cut.getSuperclass() != null) {
      getAllFields(fields, cut.getSuperclass());
    }
    return fields;
  }

}
