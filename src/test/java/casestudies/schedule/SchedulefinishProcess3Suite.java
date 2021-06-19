package casestudies.schedule;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
SchedulefinishProcess3Suite0.class, 
SchedulefinishProcess3Suite1.class, 
SchedulefinishProcess3Suite2.class
})
public class SchedulefinishProcess3Suite{
	
	public static void main(String[] args) {
		JUnitCore.runClasses(SchedulefinishProcess3Suite0.class,
				SchedulefinishProcess3Suite1.class, 
				SchedulefinishProcess3Suite2.class
				);
	}
	
}
