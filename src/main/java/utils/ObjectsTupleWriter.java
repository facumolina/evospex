package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class ObjectsTupleWriter {

	private List<ObjectOutputStream> loos;
	private XStream xstream;
	private String folder;
	
	public ObjectsTupleWriter(XStream xstream, String folder, String filesPrefix, String filesSuffix, int numFiles) {
		this.xstream = xstream;
		this.folder = folder;
		openStreams(folder, filesPrefix, filesSuffix, numFiles);
	}

	private void openStreams(String folder, String filesPrefix, String filesSuffix, int numFiles) {
		loos = new ArrayList<>();
		for (int k = 0; k < numFiles; k++) {
			String currFile = folder + "/" + filesPrefix + String.valueOf(k) + filesSuffix;
			try {
				loos.add(xstream.createObjectOutputStream(
						   new FileOutputStream(currFile)));
			} catch (IOException e) {
				throw new Error("Cannot open serial file: " + currFile);
			}
		}
	}
	
	public void writeTuple(List<Object> t) {
		for (int k = 0; k < t.size(); k++) {
			try {
				loos.get(k).writeObject(t.get(k));
			} catch (IOException e) {
				throw new Error("Cannot write objects files in folder: " + folder);
			}
		}
	}
	
	
	public void closeStreams() {
		for (ObjectOutputStream oos: loos) {
			try {
				oos.close();
			} catch (IOException e) {
				throw new Error("Cannot close files in folder: " + folder);
			}
		}
	}	
	
	
}
