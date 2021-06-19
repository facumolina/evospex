package casestudies.antlr;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
CommonTreesetParent4Suite0.class, 
CommonTreesetParent4Suite1.class, 
CommonTreesetParent4Suite2.class, 
CommonTreesetParent4Suite3.class
})
public class CommonTreesetParent4Suite{ 
	
	  public static void main(String[] args) {
		    JUnitCore.runClasses(CommonTreesetParent4Suite0.class, 
		    		CommonTreesetParent4Suite1.class, 
		    		CommonTreesetParent4Suite2.class, 
		    		CommonTreesetParent4Suite3.class);
		  }
	
}
