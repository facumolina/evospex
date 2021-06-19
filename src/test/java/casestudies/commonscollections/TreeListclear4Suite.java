package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
TreeListclear4Suite0.class, 
TreeListclear4Suite1.class, 
TreeListclear4Suite2.class, 
TreeListclear4Suite3.class, 
TreeListclear4Suite4.class, 
TreeListclear4Suite5.class
})
public class TreeListclear4Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(TreeListclear4Suite0.class, 
				TreeListclear4Suite1.class, 
				TreeListclear4Suite2.class, 
				TreeListclear4Suite3.class, 
				TreeListclear4Suite4.class, 
				TreeListclear4Suite5.class);
	}
	
}
