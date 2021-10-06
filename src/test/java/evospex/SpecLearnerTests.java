package evospex;

import static org.junit.Assert.assertTrue;

import evospex.ga.EvoSpexGA;
import org.junit.Before;
import org.junit.Test;

import utils.EvoSpexParameters;

public class SpecLearnerTests {

  @Before
  public void setUp() {
    System.gc();
  }

  @Test
  public void testLinkedList() throws Exception {
    EvoSpexGA learner = new EvoSpexGA(
        "src/test/resources/specs/linked-lists-invariants.als");
    learner.learnSpec();
    String result = learner.learnedSpec();
    assertTrue(result != null);
    System.out.println(result);
  }

  @Test
  public void testApacheList() throws Exception {
    EvoSpexGA learner = new EvoSpexGA("src/test/resources/specs/ApacheList.als");
    learner.learnSpec();
    String result = learner.learnedSpec();
    assertTrue(result != null);
    System.out.println(result);
  }

  @Test
  public void testAvlTree() throws Exception {
    EvoSpexGA learner = new EvoSpexGA("src/test/resources/specs/avl-tree.als");
    learner.learnSpec();
    String result = learner.learnedSpec();
    assertTrue(result != null);
    System.out.println(result);
  }

  @Test
  public void testLinkedListSpec() throws Exception {
    EvoSpexGA learner = new EvoSpexGA("src/test/resources/specs/linked-lists-spec.als");
    learner.learnSpecFromSpec();
    String result = learner.learnedSpec();
    assertTrue(result != null);
    System.out.println(result);
  }

  @Test
  public void testLinkedListScope3() throws Exception {
    EvoSpexGA learner = new EvoSpexGA("src/test/resources/sbst2018/LinkedListScope3.als");
    learner.learnSpecFromSpec();
    String result = learner.learnedSpec();
    assertTrue(result != null);
    System.out.println(result);
  }

  @Test
  public void testLinkedListEmptySpec() throws Exception {
    EvoSpexGA learner = new EvoSpexGA(
        "src/test/resources/specs/linked-lists-empty-spec.als");
    learner.learnSpecFromEmptySpec();
    String genes = learner.learnedSpecFromEmptySpec();
    assertTrue(genes != null);
    System.out.println("Learned Spec:");
    System.out.println(genes);
  }

  @Test
  public void testBinaryTreeSpec() throws Exception {
    EvoSpexGA learner = new EvoSpexGA("src/test/resources/specs/binary-tree-spec.als");
    learner.learnSpecFromSpec();
    String result = learner.learnedSpec();
    assertTrue(result != null);
    System.out.println(result);
  }

  @Test
  public void testBinaryTreeEmptySpec() throws Exception {
    EvoSpexGA learner = new EvoSpexGA(
        "src/test/resources/specs/binary-tree-empty-spec.als");
    learner.learnSpecFromEmptySpec();
    String genes = learner.learnedSpecFromEmptySpec();
    assertTrue(genes != null);
    System.out.println("Learned Spec:");
    System.out.println(genes);
  }

  @Before
  public void initializeConfiguration() {
    ConfigurationProperties.initialize();
    ConfigurationProperties.setFieldExhaustiveDirectory("field-exhaustive-gen");
    ConfigurationProperties.setOutputFileLocation("output");
    ConfigurationProperties.setStopCriterion("best");
    ConfigurationProperties.setIntEvaluations("true");
  }

  /**
   * Test for Singly Linked List with scope 3.
   */
  @Test
  public void testSinglyLinkedListDYN3() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/SinglyLinkedListDYN3.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Singly Linked List with scope 3 learning from instances.
   */
  @Test
  public void testSinglyLinkedListDYN3Instances() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/SinglyLinkedListDYN3Instances.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Singly Linked List with scope 5.
   */
  @Test
  public void testSinglyLinkedListDYN5() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/SinglyLinkedListDYN5.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Singly Linked List with scope 8.
   */
  @Test
  public void testSinglyLinkedListDYN8() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/SinglyLinkedListDYN8.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Singly Linked List with scope 10.
   */
  @Test
  public void testSinglyLinkedListDYN10() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/SinglyLinkedListDYN10.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Singly Sorted Linked List with scope 3.
   */
  @Test
  public void testSinglySortedLinkedListDYN3() throws Exception {
    EvoSpexParameters params = new EvoSpexParameters();
    params.setMutationProbabilty(0.01);
    int r = EvoSpex.processClass("src/test/resources/specs/SinglySortedLinkedListDYN3.als",
        params);
    assertTrue(r == 1);
  }

  /**
   * Test for Binary Tree with scope 3.
   */
  @Test
  public void testBinaryTreeDYN3() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/BinaryTreeDYN3.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Binary Tree with scope 5.
   */
  @Test
  public void testBinaryTreeDYN5() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/BinaryTreeDYN5.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Binary Search Tree with scope 5.
   */
  @Test
  public void testBinarySearchTreeDYN5() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/BinarySearchTreeDYN5.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Red Black Trees with scope 3 (The spec does not consider the paths property).
   */
  @Test
  public void testRedBlackTreeWithoutPathsPropertyDYN3() throws Exception {
    ConfigurationProperties.setIntEvaluations("false");
    int r = EvoSpex
        .processClass("src/test/resources/specs/RedBlackTreeWithoutPathsPropertyDYN3.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Red Black Trees with scope 5 (The spec does not consider the paths property).
   */
  @Test
  public void testRedBlackTreeWithoutPathsPropertyDYN5() throws Exception {
    ConfigurationProperties.setIntEvaluations("false");
    int r = EvoSpex
        .processClass("src/test/resources/specs/RedBlackTreeWithoutPathsPropertyDYN5.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Binary Heap with scope 3.
   */
  @Test
  public void testBinaryHeapDYN3() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/BinaryHeapDYN3.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Directed Acyclic Graph with scope 3.
   */
  @Test
  public void testDagDYN3() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/DagDYN3.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Singly Circular List with scope 3.
   */
  @Test
  public void testSinglyCircularListDYN3() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/SinglyCircularListDYN3.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Doubly Linked List with scope 3.
   */
  @Test
  public void testDoublyLinkedListDYN3() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/DoublyLinkedListDYN3.als");
    assertTrue(r == 1);
  }

  /**
   * Test for Doubly Linked List with scope 5.
   */
  @Test
  public void testDoublyLinkedListDYN5() throws Exception {
    int r = EvoSpex.processClass("src/test/resources/specs/DoublyLinkedListDYN5.als");
    assertTrue(r == 1);
  }

}
