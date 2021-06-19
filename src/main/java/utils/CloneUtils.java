package utils;

import java.util.LinkedList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class CloneUtils {

  private static XStream xstream = new XStream();

  public static Object cloneObject(Object o) {
    String xml = xstream.toXML(o);
    return xstream.fromXML(xml);
  }

  public static void main(String[] args) {

    List<Integer> l = new LinkedList<>();
    l.add(0);
    l.add(1);
    Object lclone = cloneObject(l);
    l.remove(0);
    System.out.println(l.toString());
    System.out.println(lclone.toString());
  }

}
