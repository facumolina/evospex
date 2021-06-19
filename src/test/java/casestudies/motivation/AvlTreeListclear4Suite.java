package casestudies.motivation;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
AvlTreeListclear4Suite0.class, 
AvlTreeListclear4Suite1.class
})
public class AvlTreeListclear4Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(AvlTreeListclear4Suite0.class, 
				AvlTreeListclear4Suite1.class);
	}
	
}
