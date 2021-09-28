package main;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PostConditionsTests {

  @Before
  public void initializeConfiguration() {
    ConfigurationProperties.initialize();
    // ConfigurationProperties.setFieldExhaustiveDirectory("field-exhaustive-gen");
    // ConfigurationProperties.setOutputFileLocation("output");
    ConfigurationProperties.setStopCriterion("best");
    ConfigurationProperties.setIntEvaluations("true");
  }

  /**
   * Class: NodeCachingLinkedList - Method add(final int index, final E value).
   */
  @Test
  public void testNodeCachingLinkedListAddInPosition() throws Exception {
    int r = EvoSpex.processClass("NodeCachingLinkedList",
        "src/test/resources/objects/NodeCachingLinkedList/add\\(int,java.lang.Object\\)/3/", 3, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: NodeCachingLinkedList - Method add(final E value).
   */
  @Test
  public void testNodeCachingLinkedListAddObject() throws Exception {
    int r = EvoSpex.processClass("NodeCachingLinkedList",
        "src/test/resources/objects/NodeCachingLinkedList/add\\(java.lang.Object\\)/3/", 2, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: NodeCachingLinkedList - Method addFirst(final E value).
   */
  @Test
  public void testNodeCachingLinkedListAddFirst() throws Exception {
    int r = EvoSpex.processClass("NodeCachingLinkedList",
        "src/test/resources/objects/NodeCachingLinkedList/addFirst\\(java.lang.Object\\)/3/", 2, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: NodeCachingLinkedList - Method clear().
   */
  @Test
  public void testNodeCachingLinkedListClear() throws Exception {
    int r = EvoSpex.processClass("NodeCachingLinkedList",
        "src/test/resources/objects/NodeCachingLinkedList/clear\\(\\)/3/", 1, 1);
    assertTrue(r == 1);
  }

  /**
   * Class: NodeCachingLinkedList - Method remove(final int index).
   */
  @Test
  public void testNodeCachingLinkedListRemovefromPosition() throws Exception {
    int r = EvoSpex.processClass("NodeCachingLinkedList",
        "src/test/resources/objects/NodeCachingLinkedList/remove\\(int\\)/3/", 2, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: TreeList - Method add(final int, final E value).
   */
  @Test
  public void testTreeListAddInPosition() throws Exception {
    int r = EvoSpex.processClass("TreeList",
        "src/test/resources/objects/TreeList/add\\(int,java.lang.Object\\)/3/", 3, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: TreeList - Method remove(final int).
   */
  @Test
  public void testTreeListRemoveFromPos() throws Exception {
    int r = EvoSpex.processClass("TreeList",
        "src/test/resources/objects/TreeList/remove\\(int\\)/3/", 2, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: AVLTreeList - Method removeElem(Object).
   */
  @Test
  public void testAVLTreeListRemoveElem() throws Exception {
    int r = EvoSpex.processClass("AvlTreeList",
        "src/test/resources/objects/AvlTreeList/removeElem\\(java.lang.Object\\)/3/", 2, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: AVLTreeList - Method add(int,Object).
   */
  @Test
  public void testAVLTreeListAddPos() throws Exception {
    int r = EvoSpex.processClass("AvlTreeList",
        "src/test/resources/objects/AvlTreeList/add\\(int,java.lang.Object\\)/3/", 3, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: AVLTreeList - Method remove(int).
   */
  @Test
  public void testAVLTreeListRemovePos() throws Exception {
    int r = EvoSpex.processClass("AvlTreeList",
        "src/test/resources/objects/AvlTreeList/remove\\(int\\)/3/", 2, 3);
    assertTrue(r == 1);
  }

  /**
   * Class: Interval - Method getSize().
   */
  @Test
  public void testIntervalGetSize() throws Exception {
    int r = EvoSpex.processClass("Interval", "src/test/resources/objects/Interval/getSize\\(\\)/3/",
        1, 2);
    assertTrue(r == 1);
  }

  /**
   * Class: Interval - Method checkPoint(double,double).
   */
  @Test
  public void testIntervalCheckPoint() throws Exception {
    int r = EvoSpex.processClass("Interval",
        "src/test/resources/objects/Interval/checkPoint\\(double,double\\)/3/", 3, 4);
    assertTrue(r == 1);
  }

  /**
   * Class: CommonTree - Method addChild(CommonTree).
   */
  @Test
  public void testCommonTreeAddChild() throws Exception {
    int r = EvoSpex.processClass("CommonTree",
        "src/test/resources/objects/CommonTree/addChild\\(casestudies.antlr.Tree\\)/3/", 2, 2);
    assertTrue(r == 1);
  }

  /**
   * Class: Schedule - Method addChild(CommonTree).
   */
  @Test
  public void testScheduleAddProcess() throws Exception {
    int r = EvoSpex.processClass("Schedule",
        "src/test/resources/objects/Schedule/addProcess\\(int\\)/3/", 2, 2);
    assertTrue(r == 1);
  }

  /**
   * Class: DoublyLinkedListNode - Method insert_right(DoublyLinkedListNode).
   */
  @Test
  public void testDoublyLinkedListNodeInsertRight() throws Exception {
    int r = EvoSpex.processClass("DoublyLinkedListNode",
        "src/test/resources/objects/DoublyLinkedListNode/insert_right\\(casestudies.eiffel.DoublyLinkedListNode\\)/3/",
        2, 2);
    assertTrue(r == 1);
  }

  /**
   * Class Composite - Method add_child(Composite).
   */
  @Test
  public void testCompositeAddChild() throws Exception {
    int r = EvoSpex.processClass("Composite",
        "src/test/resources/objects/Composite/add_child\\(casestudies.eiffel.Composite\\)/3/", 2,
        2);
    assertTrue(r == 1);
  }

  /**
   * Class Map - extend(Object,Object).
   */
  @Test
  public void testMapExtend() throws Exception {
    int r = EvoSpex.processClass("Map",
        "src/test/resources/objects/Map/extend\\(java.lang.Object,java.lang.Object\\)/3/", 3, 4);
    assertTrue(r == 1);
  }

  /**
   * Class Map - count().
   */
  @Test
  public void testMapCount() throws Exception {
    int r = EvoSpex.processClass("Map", "src/test/resources/objects/Map/count\\(\\)/3/", 1, 2);
    assertTrue(r == 1);
  }

  /**
   * Class RingBuffer - extend().
   */
  @Test
  public void testRingBufferExtend() throws Exception {
    int r = EvoSpex.processClass("RingBuffer",
        "src/test/resources/objects/RingBuffer/extend\\(java.lang.Object\\)/3/", 2, 2);
    assertTrue(r == 1);
  }

  /**
   * Class Structure - setX(Integer).
   */
  @Test
  public void testStructureSetX() throws Exception {
    int r = EvoSpex.processClass("Structure",
        "src/test/resources/objects/Structure/setX\\(java.lang.Integer\\)/3/", 2, 2);
    assertTrue(r == 1);
  }

  /**
   * Class Polyupdate - sm().
   */
  @Test
  public void testPolyupdateSm() throws Exception {
    int r = EvoSpex.processClass("Polyupdate", "src/test/resources/objects/Polyupdate/sm\\(\\)/3/",
        1, 2);
    assertTrue(r == 1);
  }

  /**
   * Class ListComp02 - clear().
   */
  @Test
  public void testListCompClear() throws Exception {
    int r = EvoSpex.processClass("ListComp02",
        "src/test/resources/objects/ListComp02/clear\\(\\)/3/", 1, 1);
    assertTrue(r == 1);
  }

  /**
   * Class ListComp02 - inser_r(R).
   */
  @Test
  public void testListCompInsertR() throws Exception {
    int r = EvoSpex.processClass("ListComp02",
        "src/test/resources/objects/ListComp02/insert_r\\(casestudies.cozy.ListComp02\\$R\\)/3/", 2,
        1);
    assertTrue(r == 1);
  }

  /**
   * Class MinFinder - findmin().
   */
  @Test
  public void testMinFinderFindmin() throws Exception {
    int r = EvoSpex.processClass("MinFinder",
        "src/test/resources/objects/MinFinder/findmin\\(\\)/3/", 1, 2);
    assertTrue(r == 1);
  }

  /**
   * Class In - addY(R).
   */
  @Test
  public void testInAddY() throws Exception {
    int r = EvoSpex.processClass("In",
        "src/test/resources/objects/In/addY\\(java.lang.Integer\\)/3/", 2, 2);
    assertTrue(r == 1);
  }

  /**
   * Class Graph - clear().
   */
  @Test
  public void testGraphClear() throws Exception {
    int r = EvoSpex.processClass("Graph", "src/test/resources/objects/Graph/clear\\(\\)/3/", 1, 1);
    assertTrue(r == 1);
  }

  /**
   * Class IntSet - add().
   */
  @Test
  public void testIntSetAdd() throws Exception {
    int r = EvoSpex.processClass("IntSet",
        "src/test/resources/objects/IntSet/add\\(java.lang.Integer\\)/3/", 2, 2);
    assertTrue(r == 1);
  }

  /**
   * Class Lobsters - insertStory().
   */
  @Test
  public void testLobstersInsertStory() throws Exception {
    int r = EvoSpex.processClass("Lobsters",
        "src/test/resources/objects/Lobsters/insertStory\\(casestudies.cozy.Lobsters\\$Story\\)/2/",
        2, 2);
    assertTrue(r == 1);
  }

  /**
   * Class MaxBag - remove(Integer).
   */
  @Test
  public void testMaxBagRemove() throws Exception {
    int r = EvoSpex.processClass("MaxBag",
        "src/test/resources/objects/MaxBag/remove\\(java.lang.Integer\\)/3/", 2, 2);
    assertTrue(r == 1);
  }

}
