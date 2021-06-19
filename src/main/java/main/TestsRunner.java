package main;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

import utils.EvoSpexParameters;

/**
 * This class will run all the tests ten times each
 * 
 * @author fmolina
 *
 */
public class TestsRunner {

  /*
   * private static String[] fileNames =
   * {"SinglyLinkedListDYN3.als","SinglySortedLinkedListDYN3.als"
   * ,"SinglyCircularListDYN3.als","DoublyLinkedListDYN3.als","BinaryTreeDYN5.als",
   * "BinarySearchTreeDYN5.als","BinaryHeapDYN3.als","DagDYN3.als",
   * "RedBlackTreeWithoutPathsPropertyDYN3.als"};
   */
  private static String[] fileNames = { "BinaryHeapDYN3.als" };

  private static double[] mutationsProbs = { 0.01, 0.05, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8 };
  private static int[] popsizes = { 20, 40, 60, 80, 100 };

  private static final int totalExecutions = 10;

  public static void main(String[] args) throws Exception {

    initializeConfiguration();

    for (int i = 0; i < fileNames.length; i++) {
      // For each test file run the genetic algorithm ten times and log the execution
      // in a specific file
      String fileName = fileNames[i];
      File dir = new File("testssbmf/" + fileName + "-Test");
      if (!dir.exists())
        dir.mkdirs();

      for (int k = 0; k < popsizes.length; k++) {

        for (int j = 0; j < totalExecutions; j++) {

          String outputFileName = "testssbmf/" + fileName + "-Test/result" + (k + 1) + "-"
              + (j + 1);
          System.setOut(new PrintStream(
              new BufferedOutputStream(new FileOutputStream(outputFileName)), true));
          EvoSpexParameters params = new EvoSpexParameters();
          params.setPopulationSize(popsizes[k]);
          EvoSpex.processFile("tests/" + fileName, params);

        }
      }
    }

  }

  private static void initializeConfiguration() {
    ConfigurationProperties.initialize();
    ConfigurationProperties.setFieldExhaustiveDirectory("field-exhaustive-gen");
    ConfigurationProperties.setOutputFileLocation("output");
    ConfigurationProperties.setStopCriterion("best");
    ConfigurationProperties.setIntEvaluations("true");
  }

}