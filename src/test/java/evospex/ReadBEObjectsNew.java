package evospex;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.thoughtworks.xstream.XStream;

import canonicalizer.BFHeapCanonicalizer;
import config.CanonicalizerConfig;
import extensions.FieldExtensionsCollector;
import utils.ObjectsTupleReader;
import utils.XStreamDeserializer;

public class ReadBEObjectsNew {

  @Test
  public void testReadNodeCachingLinkedListAddObjects() throws IOException {
    testMethod("add\\(java.lang.Object\\)");
  }

  @Test
  public void testReadNodeCachingLinkedListRemoveObjects() throws IOException {
    testMethod("remove\\(int\\)");
  }

  // Helper methods
  private void testMethod(String m) throws IOException {
    String resourcesNCL = "src/test/resources/icse2020new/NodeCachingLinkedList";
    String scope = "3";

    String objsFolder = resourcesNCL + "/" + m + "/" + scope;

    List<Object> neg = XStreamDeserializer.deserialize(objsFolder + "/mut0.xml");
    List<String> mutations = XStreamDeserializer.readStringsFile(objsFolder + "/mutations0.txt");

    System.out.println("NEG: " + neg.size());
    XStream xstream = new XStream();
    BFHeapCanonicalizer can = createCanonicalizer();
    int k = 0;

    ObjectsTupleReader inObjsreader = new ObjectsTupleReader(xstream, objsFolder, "in", ".xml", 2);
    ObjectsTupleReader outObjsreader = new ObjectsTupleReader(xstream, objsFolder, "out", ".xml",
        3);

    while (true) {

      List<Object> inObjs = inObjsreader.readTuple();
      List<Object> outObjs = outObjsreader.readTuple();
      if (inObjs == null) {
        if (outObjs != null)
          throw new Error("There are more inputs than outputs");
        break;
      }

      Object o = neg.get(k);
      String mutation = mutations.get(k);
      // String xml = xstream.toXML(o);
      System.out.println("POS: " + k);
      System.out.println("Inputs: \n" + inObjs.toString());
      System.out.println("Outputs: \n" + outObjs.toString());
      System.out.println(prettify(getCanonicalString(outObjs.get(0), can)));
      System.out.println("Mutation: ");
      System.out.println(prettify(mutation));
      System.out.println("Mutated object: ");
      System.out.println(prettify(getCanonicalString(o, can)));
      System.out.println("---------");
      k++;
    }
    System.out.println("K " + k);
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
