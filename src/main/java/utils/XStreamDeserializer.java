package utils;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class XStreamDeserializer {

  public static List<Object> deserialize(String file) {
    XStream xstream = new XStream();
    xstream.allowTypesByRegExp(new String[] { ".*" });
    List<Object> objs = new ArrayList<>();
    try {
      ObjectInputStream ois = xstream.createObjectInputStream(new FileInputStream(file));
      Object o;
      try {
        while (true) {
          o = ois.readObject();
          objs.add(o);
        }
      } catch (EOFException e) {
        /* The loop ends here */ }
      ois.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      throw new RuntimeException("Cannot deserialize file: " + file);
    }
    return objs;
  }

  public static List<String> readStringsFile(String file) {
    List<String> res = new ArrayList<>();
    try {
      File f = new File(file);
      BufferedReader b = new BufferedReader(new FileReader(f));
      String readLine = "";
      while ((readLine = b.readLine()) != null) {
        res.add(readLine);
      }
    } catch (IOException e) {
      throw new RuntimeException("Cannot read file: " + file);
    }
    return res;
  }

}
