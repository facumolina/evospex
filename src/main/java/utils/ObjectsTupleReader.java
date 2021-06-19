package utils;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class ObjectsTupleReader {

	private List<ObjectInputStream> loos;
	private XStream xstream;
	private String folder;
	
	public ObjectsTupleReader(XStream xstream, String folder, String filesPrefix, String filesSuffix, int numFiles) {
		this.xstream = xstream;
		this.folder = folder;
		openStreams(folder, filesPrefix, filesSuffix, numFiles);
	}

	private void openStreams(String folder, String filesPrefix, String filesSuffix, int numFiles) {
		loos = new ArrayList<>();
		for (int k = 0; k < numFiles; k++) {
			String currFile = folder + "/" + filesPrefix + String.valueOf(k) + filesSuffix;
			try {
				loos.add(xstream.createObjectInputStream(
						   new FileInputStream(currFile)));
			} catch (IOException e) {
				throw new Error("Cannot open serial file: " + currFile);
			}
		}
	}
	
	public List<Object> readTuple() {
		List<Object> res = new ArrayList<>();
		for (ObjectInputStream oos: loos) {
			try {
				Object o = oos.readObject();
				res.add(o);
			} catch (EOFException e) {
				return null;
			} catch (IOException | ClassNotFoundException e) {
				throw new Error("Cannot read files in folder: " + folder);
			}
		}
		return res;
	}
	
	
	public void closeStreams() {
		for (ObjectInputStream oos: loos) {
			try {
				oos.close();
			} catch (IOException e) {
				throw new Error("Cannot close files in folder: " + folder);
			}
		}
	}	
	
	
}
