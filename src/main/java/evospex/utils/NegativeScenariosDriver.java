package evospex.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Properties;

import evospex.target.MethodExecution;

public class NegativeScenariosDriver {

  private static Class<?> cua; // Class under analysis
  private static Method mua; // Method under analysis

  private static String args_file = "negscenariosdriver.properties"; // The arguments are going to
                                                                     // be loaded from a file in
                                                                     // order to
  // avoid the main method receiving arguments

  public static void main(String[] args) {
    if (args.length > 0)
      throw new IllegalArgumentException("No arguments should be provided");

    Properties prop = load_properties();

    String fqn_class = prop.getProperty("fqname");
    String method = prop.getProperty("method");
    String base_folder = prop.getProperty("objects_dir");

    System.out.println("> Analyzing " + fqn_class + "." + method);
    System.out.println("> Negative Scenarios being retrieved from: " + base_folder);

    get_cua_mua(fqn_class, method);
    ObjectsLoader.load_objects(base_folder);
    int total_neg = ObjectsLoader.total_negatives();
    System.out.println("  Total negative scenarios: " + total_neg);
    System.out.println("  Executing each scenario..");

    if (ObjectsLoader.num_args == 1) {
      execute_method_noargs(total_neg);
    } else {
      execute_method_args(total_neg);
    }

    System.out.println("> Done!");
  }

  /**
   * Load the properties
   */
  private static Properties load_properties() {
    try (InputStream input = new FileInputStream(args_file)) {

      Properties prop = new Properties();

      // load a properties file
      prop.load(input);

      return prop;

    } catch (IOException ex) {
      ex.printStackTrace();
      return null;
    }

  }

  /**
   * Execute method without arguments
   */
  private static void execute_method_noargs(int executions) {
    for (int i = 0; i < executions; i++) {
      MethodExecution me = ObjectsLoader.get_neg(i);
      Object object_from = me.getObjectFrom();
      try {
        Object r = mua.invoke(object_from);
        System.out.println("Result is: " + (r == null ? "null" : r.toString()));
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("  Method execution failed");
        break;
      }
    }
  }

  /**
   * Execute method with arguments
   */
  private static void execute_method_args(int executions) {
    for (int i = 0; i < executions; i++) {
      MethodExecution me = ObjectsLoader.get_neg(i);
      Object object_from = me.getObjectFrom();
      List<Object> arguments = me.getMethodArguments();
      Class<?>[] param_types = mua.getParameterTypes();
      try {
        Object r = null;
        boolean done = false;
        if (arguments.size() == 1) {
          r = mua.invoke(object_from, param_types[0].cast(arguments.get(0)));
          done = true;
        }
        if (!done) {
          throw new Exception("Unable to handle number of arguments: " + arguments.size());
        }
        if (ObjectsLoader.num_outputs > ObjectsLoader.num_args)
          System.out.println("Result is: " + (r == null ? "null" : r.toString()));
      } catch (Exception e) {
        e.printStackTrace();
        System.out.println("  Method execution failed");
        break;
      }
    }
  }

  /**
   * Get the class and method under analysis
   */
  private static void get_cua_mua(String fqname, String method) {
    try {
      ClassLoader classLoader = ClassLoader.getSystemClassLoader();
      cua = classLoader.loadClass(fqname);
      mua = get_method(cua, method);
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("> Unable to get class and method under analysis");
    }
  }

  /**
   * Search for the method method_name even in the superclass
   */
  private static Method get_method(Class<?> clazz, String method_name) {
    Class<?> tmpClass = clazz;
    do {
      Method[] methods = tmpClass.getDeclaredMethods();
      for (Method m : methods) {
        if (m.getName().equals(method_name))
          return m;
      }
      tmpClass = tmpClass.getSuperclass();
    } while (tmpClass != null && tmpClass != Object.class);

    throw new RuntimeException("Method '" + method_name + "' not found on class " + clazz);
  }

}
