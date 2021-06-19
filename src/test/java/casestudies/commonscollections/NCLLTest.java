package casestudies.commonscollections;

import org.junit.Test;

import casestudies.commonscollections.AbstractLinkedList.Node;

public class NCLLTest {

  @Test
  public void test0() {
    NodeCachingLinkedList<String> ncll = new NodeCachingLinkedList<String>(-2166);
    Node<String> headerPrevNext = ncll.header.previous.next;
    Node<String> headerNextPrev = ncll.header.next.previous;
    Node<String> headerPrev = ncll.header.previous;
    String oldvalue = ncll.header.value;
    int oldsize = ncll.size();
    boolean r = ncll.addLast("NCLL");
    assert (ncll.header.previous.value == oldvalue);
  }
}
