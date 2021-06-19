package casestudies.schedule;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
SchedulenewProcess3Suite0.class, 
SchedulenewProcess3Suite1.class, 
SchedulenewProcess3Suite2.class
})
public class SchedulenewProcess3Suite{
	
	public static void main(String[] args) {
		JUnitCore.runClasses(SchedulenewProcess3Suite0.class,
				SchedulenewProcess3Suite1.class, 
				SchedulenewProcess3Suite2.class
				);
	}
	
}
