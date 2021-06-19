package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
TreeListremove14Suite0.class, 
TreeListremove14Suite1.class, 
TreeListremove14Suite2.class, 
TreeListremove14Suite3.class, 
TreeListremove14Suite4.class, 
TreeListremove14Suite5.class
})
public class TreeListremove14Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(TreeListremove14Suite0.class, 
				TreeListremove14Suite1.class, 
				TreeListremove14Suite2.class, 
				TreeListremove14Suite3.class, 
				TreeListremove14Suite4.class, 
				TreeListremove14Suite5.class);
	}
	
}
