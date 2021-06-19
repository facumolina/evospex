package casestudies.schedule;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
ScheduleupgradeProcessPrio3Suite0.class, 
ScheduleupgradeProcessPrio3Suite1.class, 
ScheduleupgradeProcessPrio3Suite2.class, 
ScheduleupgradeProcessPrio3Suite3.class
})
public class ScheduleupgradeProcessPrio3Suite{
	
	public static void main(String[] args) {
		JUnitCore.runClasses(ScheduleupgradeProcessPrio3Suite0.class,
				ScheduleupgradeProcessPrio3Suite1.class, 
				ScheduleupgradeProcessPrio3Suite2.class,
				ScheduleupgradeProcessPrio3Suite3.class
				);
	}
	
}
