package main;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import canonicalizer.BFHeapCanonicalizer;
import config.CanonicalizerConfig;
import extensions.FieldExtensionsCollector;
import utils.XStreamDeserializer;

public class ReadBEObjects {

  @Test
  public void testReadNodeCachingLinkedListAddObjects() throws IOException {
    testMethod("add\\(java.lang.Object\\)");
  }

  @Test
  public void testReadNodeCachingLinkedListRemoveObjects() throws IOException {
    testMethod("remove\\(int\\)");
  }

  @Test
  public void testReadNodeCachingLinkedListConstructorObjects() throws IOException {
    testMethod("\\<init\\>\\(\\)");
  }

  // Helper methods
  private void testMethod(String m) throws IOException {
    String resourcesNCL = "src/test/resources/icse2020/NodeCachingLinkedList";
    String scope = "3";
    List<Object> pre = XStreamDeserializer
        .deserialize(resourcesNCL + "/" + m + "/" + scope + "/inputs.xml");
    System.out.println("PRE: " + pre.size());
    for (Object o : pre) {
      System.out.println(o.toString());
    }
    BFHeapCanonicalizer can = createCanonicalizer();
    List<Object> post = XStreamDeserializer
        .deserialize(resourcesNCL + "/" + m + "/" + scope + "/outputs.xml");
    System.out.println("POST: " + post.size());
    for (Object o : post) {
      // System.out.println(o.toString());
      System.out.println("Object: ");
      System.out.println(prettify(getCanonicalString(o, can)));
      System.out.println("---------");
    }
    List<Object> neg = XStreamDeserializer
        .deserialize(resourcesNCL + "/" + m + "/" + scope + "/negatives.xml");
    List<String> mutations = XStreamDeserializer
        .readStringsFile(resourcesNCL + "/" + m + "/" + scope + "/mutations.txt");
    System.out.println("NEG: " + neg.size());
    // XStream xstream = new XStream();
    for (int k = 0; k < neg.size(); k++) {
      Object o = neg.get(k);
      String mutation = mutations.get(k);
      // String xml = xstream.toXML(o);
      // System.out.println(xml);
      System.out.println("Mutation: ");
      System.out.println(prettify(mutation));
      System.out.println("Object: ");
      System.out.println(prettify(getCanonicalString(o, can)));
      System.out.println("---------");
    }
  }

  private BFHeapCanonicalizer createCanonicalizer() throws IOException {
    CanonicalizerConfig cfg = CanonicalizerConfig.fromFile(
        "src/test/resources/icse2020/NodeCachingLinkedList/NodeCachingLinkedList.sc3.canonicalizer.properties");
    return new BFHeapCanonicalizer(cfg);
  }

  private String getCanonicalString(Object o, BFHeapCanonicalizer can) {
    FieldExtensionsCollector col = new FieldExtensionsCollector();
    can.canonicalize(o, col);
    return col.getExtensions().toSortedString()
    // Remove package names from the strings for better readability
    ;
  }

  private String prettify(String str) {
    return str.replaceAll("casestudies.commonscollections.AbstractLinkedList\\$", "")
        .replaceAll("casestudies.commonscollections.", "");
  }

}
