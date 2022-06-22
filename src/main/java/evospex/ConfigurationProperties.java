package evospex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This class will read and provide the properties defined in the configuration file.
 * 
 * @author fmolina
 */
public class ConfigurationProperties {

  private static Properties properties;
  private static final String FIELD_EXHAUSTIVE_DIR = "fieldExhaustiveDir";
  private static final String OUTPUT_FILE_LOC = "outputFileLocation";
  private static final String STOP_CRITERION = "stopCriterion";
  private static final String CONSIDER_INT_EVALUATIONS = "intEvaluations";

  /**
   * Initialize
   */
  public static void initialize() {
    properties = new Properties();
  }

  /**
   * Load the given properties file.
   */
  public static void loadFile(String configurationFile) {
    properties = new Properties();
    try {
      InputStream input = new FileInputStream(configurationFile);
      // load a properties file
      properties.load(input);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * Returns the field exhaustive directory
   */
  public static String getFieldExhaustiveDirectory() {
    if (properties != null) {
      return properties.getProperty(FIELD_EXHAUSTIVE_DIR);
    }
    return "field-exhaustive-gen";
  }

  /**
   * Set the field exhaustive directory
   */
  public static void setFieldExhaustiveDirectory(String filePath) {
    if (properties != null && filePath != null)
      properties.setProperty(FIELD_EXHAUSTIVE_DIR, filePath);
  }

  /**
   * Returns the output file location
   */
  public static String getOutputFileLocation() {
    if (properties != null)
      return properties.getProperty(OUTPUT_FILE_LOC);
    return "output";
  }

  /**
   * Set the output file location
   */
  public static void setOutputFileLocation(String outputLoc) {
    if (properties != null && outputLoc != null)
      properties.setProperty(OUTPUT_FILE_LOC, outputLoc);
  }

  /**
   * Returns the stop criterion
   */
  public static String getStopCriterion() {
    if (properties != null)
      return properties.getProperty(STOP_CRITERION);
    return "";
  }

  /**
   * Set the stop criterion
   */
  public static void setStopCriterion(String criterion) {
    if (properties != null && criterion != null)
      properties.setProperty(STOP_CRITERION, criterion);
  }

  /**
   * Returns true if the int evaluations must be considered
   */
  public static boolean getIntEvaluations() {
    if (properties != null) {
      return "true".equalsIgnoreCase(properties.getProperty(CONSIDER_INT_EVALUATIONS));
    }
    return true;
  }

  /**
   * Set consider int evaluations
   */
  public static void setIntEvaluations(String intEval) {
    if (properties != null && intEval != null)
      properties.setProperty(CONSIDER_INT_EVALUATIONS, intEval);
  }

}
