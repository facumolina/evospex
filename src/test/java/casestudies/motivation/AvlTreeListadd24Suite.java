package casestudies.motivation;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
AvlTreeListadd24Suite0.class, 
AvlTreeListadd24Suite1.class
})
public class AvlTreeListadd24Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(AvlTreeListadd24Suite0.class, 
				AvlTreeListadd24Suite1.class);
	}
	
}
