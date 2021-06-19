package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
TreeListremove24Suite0.class, 
TreeListremove24Suite1.class, 
TreeListremove24Suite2.class, 
TreeListremove24Suite3.class
})
public class TreeListremove24Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(TreeListremove24Suite0.class, 
				TreeListremove24Suite1.class, 
				TreeListremove24Suite2.class, 
				TreeListremove24Suite3.class);
	}
	
}
