package utils;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import evospex.target.MethodExecution;

/**
 * This class allows to load serialized objects from a particular folder
 * 
 * Only developed to be used by external tools
 * 
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 *
 */
public class ObjectsLoader {

  private static List<MethodExecution> positives;
  private static List<MethodExecution> negatives;
  public static int num_args;
  public static int num_outputs;
  private static int counter = 0;

  public static void main(String[] args) {
    if (args.length != 1)
      throw new IllegalArgumentException("The only expected argument is the objects folder");

    String base_folder = args[0];
    if (base_folder == null || "".equals(base_folder))
      throw new IllegalArgumentException("Invalid objects folder");

    System.out.println("> Loading objects from folder: " + base_folder);
    load_objects(base_folder);

    System.out.println("Positive objects: " + positives.size());
    System.out.println("Negative objects: " + negatives.size());
    System.out.println("> Done!");
  }

  /**
   * Load the objects from the given base folder
   */
  public static void load_objects(String base_folder) {
    determine_numbers(base_folder);

    boolean pc_with_result = num_outputs > num_args;
    boolean pc_with_arg = num_args > 1;

    // Load objects from files
    List<Object> neg = XStreamDeserializer.deserialize(base_folder + "mut0.xml");
    List<String> mutations = XStreamDeserializer.readStringsFile(base_folder + "mutations0.txt");
    List<Object> resultNeg = new LinkedList<Object>();
    if (pc_with_result)
      resultNeg = XStreamDeserializer.deserialize(base_folder + "mut" + (num_outputs - 1) + ".xml");

    XStream xstream = new XStream();
    xstream.allowTypesByRegExp(new String[] { ".*" });
    int k = 0;
    ObjectsTupleReader inObjsreader = new ObjectsTupleReader(xstream,
        base_folder.substring(0, base_folder.length() - 1), "in", ".xml", num_args);
    ObjectsTupleReader outObjsreader = new ObjectsTupleReader(xstream,
        base_folder.substring(0, base_folder.length() - 1), "out", ".xml", num_outputs);

    // Build method execution objects
    positives = new LinkedList<MethodExecution>();
    negatives = new LinkedList<MethodExecution>();
    while (true) {
      List<Object> inObjs = inObjsreader.readTuple();
      List<Object> outObjs = outObjsreader.readTuple();
      if (inObjs == null) {
        if (outObjs != null)
          throw new Error("There are more inputs than outputs");
        break;
      }
      Object i = inObjs.get(0);
      Object p = outObjs.get(0);
      Object r = null;
      Object rMut = null;
      List<Object> args = new LinkedList<Object>();
      if (pc_with_result) {
        r = outObjs.get(num_outputs - 1);
        rMut = resultNeg.get(k);

      }
      if (pc_with_arg) {
        for (int l = 1; l < num_args; l++) {
          Object argL = inObjs.get(l);
          args.add(argL);
        }

      }
      MethodExecution positive = new MethodExecution(i, p, args, r, true);
      positives.add(positive);
      Object n = neg.get(k);
      String mutation = mutations.get(k);
      MethodExecution negative = new MethodExecution(i, n, args, rMut, false);

      negative.setMutation(mutation, k);
      negatives.add(negative);
      k++;
    }

  }

  /**
   * Determine the number of argument and output files
   */
  private static void determine_numbers(String base_folder) {
    try {
      File objects_folder = new File(base_folder);
      File[] files = objects_folder.listFiles();
      int args_counter = 0;
      int output_counter = 0;
      for (File f : files) {
        if (f.getName().startsWith("in"))
          args_counter++;
        if (f.getName().startsWith("out"))
          output_counter++;
      }
      num_args = args_counter;
      num_outputs = output_counter;
    } catch (Exception e) {
      System.out.println("> Unable to inspect directory: " + base_folder);
    }
  }

  /**
   * Get the number of negative scenarios
   */
  public static int total_negatives() {
    return negatives == null ? 0 : negatives.size();
  }

  /**
   * Get i-th neg case
   */
  public static MethodExecution get_neg(int i) {
    if (i < 0 || i > total_negatives())
      throw new IllegalArgumentException("Invalid position");
    return negatives.get(i);
  }

  /**
   * Get i-th neg final object
   */
  public static Object get_neg_final_obj(int i) {
    if (i < 0 || i > total_negatives())
      throw new IllegalArgumentException("Invalid position");
    return negatives.get(i).getObjectFinalState();
  }

  /**
   * Get i-th neg result
   */
  public static Object get_neg_result(int i) {
    if (i < 0 || i > total_negatives())
      throw new IllegalArgumentException("Invalid position");
    return negatives.get(i).getResult();
  }

  /**
   * Get neg Method Execution based on counter
   */
  public static MethodExecution get_next_neg() {
    if (counter < 0 || counter > total_negatives())
      throw new IllegalArgumentException("Invalid counter");
    MethodExecution me = negatives.get(counter);
    counter++;
    return me;
  }

}