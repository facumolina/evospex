package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
TreeListadd24Suite0.class, 
TreeListadd24Suite1.class, 
TreeListadd24Suite2.class, 
TreeListadd24Suite3.class, 
TreeListadd24Suite4.class, 
TreeListadd24Suite5.class
})
public class TreeListadd24Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(TreeListadd24Suite0.class, 
				TreeListadd24Suite1.class, 
				TreeListadd24Suite2.class, 
				TreeListadd24Suite3.class, 
				TreeListadd24Suite4.class, 
				TreeListadd24Suite5.class);
	}
	
}
