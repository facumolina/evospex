package evospex;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import rfm.dynalloyCompiler.ast.Expr;
import wrapper.DynAlloyRunner;

public class DynAlloyWrapperTests {
	
	@Test
	public void test() throws Exception {
		File f1 = new File("src/test/resources/specs/linked-lists-invariants.als");
		DynAlloyRunner runner = new DynAlloyRunner(f1, "catalog","repOK");
		// 11 elements
		ArrayList<Expr> elements = runner.getRepOkElements();
		assertTrue(elements.size() == 11);
		// 4 asserts
		assertTrue(runner.getNumberOfAssertions() == 4);
	}
	
	@Test
	public void test2() throws Exception {
		File f1 = new File("src/test/resources/specs/linked-lists-invariants.als");
		DynAlloyRunner runner = new DynAlloyRunner(f1,"catalog","repOK");
		boolean[] res =	runner.checkAsserts();
		boolean[] expected = {true,true,false,false};
		assertTrue(Arrays.equals( res,expected));
	}	

}
