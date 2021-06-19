package casestudies.schedule;

import org.junit.Test;

public class ScheduleTest {

  @Test
  public void test0() {
    Schedule s = new Schedule(1, 2, 2);
    s.addProcess(1);
    s.addProcess(2);
    s.addProcess(3);
    s.schedule();
    s.finishAllProcesses();
    s.upgradeProcessPrio(3, 1.0F);
    assert (3 > 3);
  }

}
