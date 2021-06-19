package casestudies.schedule;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ScheduleaddProcess3Suite2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test001"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test002"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job13 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test003"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job13 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test004"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(1);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job14 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test005"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job13 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test006"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job13 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test007"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job14 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test008"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job14 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test009"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job14 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test010"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job14 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test011"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test012"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test013"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test014"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test015"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test016"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test017"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test018"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test019"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test020"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test021"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test022"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test023"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test024"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test025"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test026"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test027"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test028"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test029"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test030"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test031"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test032"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test033"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test034"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test035"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test036"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test037"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test038"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test039"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test040"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test041"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test042"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test043"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test044"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test045"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test046"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test047"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test048"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test049"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test050"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test051"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test052"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test053"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test054"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test055"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test056"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test057"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test058"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test059"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test060"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test061"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test062"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test063"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test064"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test065"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test066"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test067"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test068"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test069"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test070"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test071"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test072"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test073"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job16 = schedule3.newProcess(0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.IllegalArgumentException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test074"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job16 = schedule3.newProcess(0);
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

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test075"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job17 = schedule3.newProcess(0);
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

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test076"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    // The following exception was thrown during execution in test generation
    try {
    casestudies.schedule.Job job17 = schedule3.newProcess(0);
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

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test077"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test078"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test079"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test080"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test081"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test082"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test083"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test084"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test085"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test086"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test087"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test088"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test089"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test090"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test091"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test092"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test093"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test094"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test095"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test096"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test097"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test098"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test099"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test100"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test101"); }


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
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test102"); }


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
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test103"); }


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
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test104"); }


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
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test105"); }


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
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test106"); }


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
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test107"); }


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
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test108"); }


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
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test109"); }


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
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test110"); }


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
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test111"); }


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
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test112"); }


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
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test113"); }


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
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test114"); }


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
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test115"); }


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
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test116"); }


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
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test117"); }


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
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test118"); }


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
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test119"); }


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
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test120"); }


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
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test121"); }


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
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test122"); }


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
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test123"); }


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
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test124"); }


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
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test125"); }


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
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test126"); }


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
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test127"); }


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
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test128"); }


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
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test129"); }


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
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test130"); }


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
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test131"); }


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
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test132"); }


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
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test133"); }


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
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test134"); }


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
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test135"); }


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
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test136"); }


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
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test137"); }


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
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test138"); }


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
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test139"); }


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
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test140"); }


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
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test141"); }


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
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test142"); }


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
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test143"); }


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
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test144"); }


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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test145"); }


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
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test146"); }


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
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test147"); }


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
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test148"); }


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
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test149"); }


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
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test150"); }


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
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test151"); }


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
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test152"); }


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
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test153"); }


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
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test154"); }


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
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test155"); }


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
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test156"); }


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
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test157"); }


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
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test158"); }


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
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test159"); }


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
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test160"); }


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
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test161"); }


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
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test162"); }


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
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test163"); }


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
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test164"); }


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
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test165"); }


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
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test166"); }


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
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test167"); }


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
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test168"); }


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
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test169"); }


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
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test170"); }


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
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test171"); }


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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test172"); }


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
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test173"); }


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
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test174"); }


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
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test175"); }


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
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test176"); }


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
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test177"); }


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
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test178"); }


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
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test179"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
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
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test180"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
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
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test181"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
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
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test182"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
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
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test183"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
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
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test184"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
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
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test185"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test186"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test187"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test188"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test189"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test190"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test191"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test192"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test193"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test194"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test195"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test196"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test197"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test198"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test199"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test200"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test201"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test202"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
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
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test203"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test204"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test205"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test206"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
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
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test207"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test208"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test209"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test210"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test211"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test212"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test213"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test214"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test215"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test216"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
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
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test217"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test218"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.5f);
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
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test219"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test220"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test221"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
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
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test222"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
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
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test223"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    schedule3.addProcess(1);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test224"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.addProcess(1);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test225"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.addProcess(1);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test226"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.addProcess(1);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test227"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    schedule3.addProcess(1);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test228"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(1);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test229"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.addProcess(1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test230"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 1);
    schedule3.addProcess(1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test231"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 1);
    schedule3.addProcess(1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test232"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test233"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test234"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test235"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test236"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test237"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test238"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test239"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test240"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test241"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(1);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test242"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test243"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test244"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test245"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test246"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test247"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test248"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test249"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test250"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test251"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test252"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test253"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test254"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test255"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test256"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(1);
    schedule3.addProcess(1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test257"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.addProcess(1);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test258"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.addProcess(1);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test259"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.addProcess(1);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test260"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.addProcess(1);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test261"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.addProcess(1);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test262"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(1);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test263"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test264"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(1);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test265"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(1);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test266"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    schedule3.addProcess(2);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test267"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.addProcess(2);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test268"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.addProcess(2);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test269"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.addProcess(2);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test270"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 1, 0);
    schedule3.addProcess(2);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test271"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test272"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test273"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test274"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test275"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test276"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test277"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test278"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test279"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test280"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.quantumExpire();
    schedule3.addProcess(2);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test281"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test282"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test283"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test284"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test285"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test286"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test287"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 1);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test288"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 1);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test289"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test290"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.addProcess(2);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test291"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.addProcess(2);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test292"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.addProcess(2);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test293"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 1, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.addProcess(2);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test294"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.addProcess(2);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test295"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test296"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test297"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ScheduleaddProcess3Suite2.test298"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);

  }

}
