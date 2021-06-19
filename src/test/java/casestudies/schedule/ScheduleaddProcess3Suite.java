package casestudies.schedule;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//import casestudies.motivation.AvlTreeListremove3Suite0;

@RunWith(Suite.class)
@Suite.SuiteClasses({ ScheduleaddProcess3Suite0.class, ScheduleaddProcess3Suite1.class,
    ScheduleaddProcess3Suite2.class })
public class ScheduleaddProcess3Suite {

  public static void main(String[] args) {
    JUnitCore.runClasses(ScheduleaddProcess3Suite0.class, ScheduleaddProcess3Suite1.class,
        ScheduleaddProcess3Suite2.class);
  }

}
