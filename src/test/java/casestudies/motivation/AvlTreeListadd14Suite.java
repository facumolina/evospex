package casestudies.motivation;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
AvlTreeListadd14Suite0.class, 
AvlTreeListadd14Suite1.class
})
public class AvlTreeListadd14Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(AvlTreeListadd14Suite0.class, 
				AvlTreeListadd14Suite1.class);
	}
	
}
