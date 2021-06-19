package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
TreeListadd14Suite0.class, 
TreeListadd14Suite1.class, 
TreeListadd14Suite2.class, 
TreeListadd14Suite3.class
})
public class TreeListadd14Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(TreeListadd14Suite0.class, 
				TreeListadd14Suite1.class, 
				TreeListadd14Suite2.class, 
				TreeListadd14Suite3.class);
	}
	
}
