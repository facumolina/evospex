package main;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SBST2018Tests {

	@Before
	public void setUp() {
		System.gc();
	}	
	
	@Before
	public void initializeConfiguration() {
		ConfigurationProperties.initialize();
		ConfigurationProperties.setFieldExhaustiveDirectory("field-exhaustive-gen");
		ConfigurationProperties.setOutputFileLocation("output");
		ConfigurationProperties.setStopCriterion("first");
		ConfigurationProperties.setIntEvaluations("true");
	}
	
	@Test
	public void SinglyLinkedListDYN3() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/SinglyLinkedListDYN3.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void SinglyCircularListDYN3() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/SinglyCircularListDYN3.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void SinglySortedLinkedListDYN3() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/SinglySortedLinkedListDYN3.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void DoublyLinkedListDYN3() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/DoublyLinkedListDYN3.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void DoublyLinkedListDYN5() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/DoublyLinkedListDYN5.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void BinaryTreeDYN5() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/BinaryTreeDYN5.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void BinaryHeapDYN3() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/BinaryHeapDYN3.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void BinarySearchTreeDYN5() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/BinarySearchTreeDYN5.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void DagDYN3() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/DagDYN3.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void RedBlackTreeWithoutPathsPropertyDYN3() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/RedBlackTreeWithoutPathsPropertyDYN3.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
	@Test
	public void RedBlackTreeWithoutPathsPropertyDYN5() throws Exception {
		EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/RedBlackTreeWithoutPathsPropertyDYN5.als");
		learner.learnSpecFromSpec();
		String result = learner.learnedSpec();
		assertTrue(result != null);
		System.out.println(result);
	}
	
}
