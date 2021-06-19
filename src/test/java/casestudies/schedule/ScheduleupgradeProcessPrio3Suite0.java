package casestudies.schedule;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ScheduleupgradeProcessPrio3Suite0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test001"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test002"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test003"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test004"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test005"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test006"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test007"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test008"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test009"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test010"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test011"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test012"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test013"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test014"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test015"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test016"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test017"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test018"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test019"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test020"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test021"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test022"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test023"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test024"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test025"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test026"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test027"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test028"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test029"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test030"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test031"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test032"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test033"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test034"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test035"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test036"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test037"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test038"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test039"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test040"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test041"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test042"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test043"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test044"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test045"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test046"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test047"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test048"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test049"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test050"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test051"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test052"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test053"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job5 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test054"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    casestudies.schedule.Job job5 = schedule3.newProcess(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(job5);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test055"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    casestudies.schedule.Job job5 = schedule3.newProcess(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(job5);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test056"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test057"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test058"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test059"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test060"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test061"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test062"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test063"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test064"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test065"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test066"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test067"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test068"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test069"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test070"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test071"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test072"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test073"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test074"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test075"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test076"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test077"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test078"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test079"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test080"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test081"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test082"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test083"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test084"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test085"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test086"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test087"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test088"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test089"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test090"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test091"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test092"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test093"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test094"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test095"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test096"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test097"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test098"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test099"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test100"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test101"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test102"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test103"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test104"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test105"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test106"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test107"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test108"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test109"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test110"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test111"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test112"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test113"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test114"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test115"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test116"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test117"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test118"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test119"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test120"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test121"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test122"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test123"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test124"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test125"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test126"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test127"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test128"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test129"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test130"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test131"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test132"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test133"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test134"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test135"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test136"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test137"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test138"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test139"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test140"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test141"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test142"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test143"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test144"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test145"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test146"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test147"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test148"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test149"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test150"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test151"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test152"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test153"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test154"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test155"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test156"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test157"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test158"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test159"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test160"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test161"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test162"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test163"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test164"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test165"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test166"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test167"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 2, 0);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test168"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test169"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test170"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test171"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test172"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test173"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test174"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test175"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test176"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test177"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test178"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test179"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test180"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test181"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test182"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test183"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test184"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test185"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test186"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test187"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test188"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test189"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test190"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test191"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test192"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test193"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test194"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test195"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test196"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test197"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test198"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test199"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test200"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test201"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test202"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test203"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test204"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test205"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test206"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test207"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test208"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test209"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test210"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test211"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test212"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test213"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test214"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test215"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test216"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test217"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test218"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test219"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test220"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test221"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test222"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test223"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test224"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test225"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test226"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test227"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test228"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test229"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test230"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test231"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test232"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job7 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test233"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job7 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test234"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test235"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test236"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test237"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test238"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test239"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test240"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test241"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test242"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test243"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test244"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test245"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test246"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test247"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test248"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test249"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test250"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test251"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job6 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test252"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test253"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    schedule3.quantumExpire();

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test254"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    schedule3.quantumExpire();

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test255"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.quantumExpire();

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test256"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.schedule();

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test257"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test258"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test259"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test260"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test261"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test262"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test263"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test264"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test265"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test266"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test267"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test268"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test269"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test270"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test271"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test272"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test273"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test274"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test275"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test276"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test277"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test278"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test279"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test280"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test281"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test282"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test283"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test284"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test285"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test286"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test287"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test288"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test289"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test290"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test291"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test292"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test293"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test294"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test295"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test296"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test297"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test298"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test299"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test300"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.5f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test301"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test302"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test303"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test304"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test305"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test306"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test307"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test308"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test309"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test310"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test311"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test312"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test313"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test314"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test315"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test316"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test317"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test318"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test319"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test320"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test321"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 1.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test322"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test323"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test324"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test325"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test326"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test327"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test328"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test329"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test330"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test331"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test332"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test333"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test334"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test335"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test336"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test337"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test338"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test339"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test340"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test341"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test342"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test343"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test344"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test345"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test346"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test347"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test348"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test349"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test350"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test351"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test352"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test353"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test354"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test355"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test356"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test357"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test358"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test359"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test360"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test361"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test362"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test363"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test364"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test365"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test366"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test367"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test368"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test369"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test370"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test371"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test372"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test373"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test374"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test375"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test376"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test377"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test378"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test379"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test380"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test381"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test382"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test383"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test384"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, (float)2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test385"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test386"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test387"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test388"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test389"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test390"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test391"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test392"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test393"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test394"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test395"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test396"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test397"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test398"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test399"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test400"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test401"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test402"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test403"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test404"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test405"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test406"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test407"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test408"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test409"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test410"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test411"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test412"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test413"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test414"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test415"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test416"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test417"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test418"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test419"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test420"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test421"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test422"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test423"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test424"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.addProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test425"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test426"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test427"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test428"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test429"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test430"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test431"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.addProcess(1);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test432"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.addProcess(1);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test433"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.addProcess(1);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test434"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.addProcess(1);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test435"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.addProcess(1);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test436"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(1);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test437"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.addProcess(2);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test438"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.addProcess(2);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test439"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.addProcess(2);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test440"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.addProcess(2);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test441"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.addProcess(2);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test442"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test443"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test444"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test445"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test446"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test447"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test448"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test449"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test450"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test451"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test452"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test453"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test454"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test455"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test456"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test457"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test458"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test459"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test460"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test461"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test462"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test463"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test464"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test465"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test466"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test467"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test468"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test469"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test470"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test471"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test472"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test473"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test474"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test475"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test476"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test477"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test478"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job8 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test479"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.quantumExpire();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job9 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test480"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.schedule();
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job9 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test481"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job9 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test482"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job9 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test483"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test484"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test485"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test486"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test487"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test488"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test489"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test490"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test491"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test492"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test493"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test494"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test495"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test496"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test497"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test498"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test499"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleupgradeProcessPrio3Suite0.test500"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    schedule3.upgradeProcessPrio(0, 0.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

}
