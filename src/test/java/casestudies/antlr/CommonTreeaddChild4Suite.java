package casestudies.antlr;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
CommonTreeaddChild4Suite0.class, 
CommonTreeaddChild4Suite1.class, 
CommonTreeaddChild4Suite2.class, 
CommonTreeaddChild4Suite3.class
})
public class CommonTreeaddChild4Suite{ 
	
	  public static void main(String[] args) {
		    JUnitCore.runClasses(CommonTreeaddChild4Suite0.class, 
		    		CommonTreeaddChild4Suite1.class, 
		    		CommonTreeaddChild4Suite2.class, 
		    		CommonTreeaddChild4Suite3.class);
		  }
	  
}
