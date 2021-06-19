package main;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * This class will run all the tests ten times each
 * @author fmolina
 *
 */
public class SBSTTestsRunner {

	/*private static String[] fileNames = {"SinglyLinkedListDYN3.als","SinglySortedLinkedListDYN3.als"
			,"SinglyCircularListDYN3.als","DoublyLinkedListDYN3.als","BinaryTreeDYN5.als", 
			"BinarySearchTreeDYN5.als","BinaryHeapDYN3.als","DagDYN3.als",
			"RedBlackTreeWithoutPathsPropertyDYN3.als"};*/
	private static String[] fileNames = {"BinaryHeapDYN3.als","DagDYN3.als",
			"RedBlackTreeWithoutPathsPropertyDYN3.als"};
	private static final int totalExecutions = 10;
	
	public static void main(String[] args) throws Exception {
		
		initializeConfiguration();
		
		for (int i=0;i<fileNames.length;i++) {
			// For each test file run the genetic algorithm ten times and log the execution
			// in a specific file
			String fileName = fileNames[i];
			File dir = new File("testsResult/"+fileName+"-Test");
			if (!dir.exists())
				dir.mkdirs();
		
			for (int k = 0 ; k < totalExecutions; k++) {
				
				String outputFileName = "testsResult/"+fileName+"-Test/result"+(k+1);
				System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(outputFileName)),true));
				
				CatalogueLearner.processFile("src/test/resources/sbst2018/"+fileName);
				
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