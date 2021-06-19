package casestudies.schedule;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SchedulefinishProcess3Suite2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test001"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test002"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test003"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test004"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test005"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test006"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test007"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test008"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test009"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test010"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test011"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test012"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test013"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test014"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test015"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test016"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test017"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test018"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test019"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test020"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.quantumExpire();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test021"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(1, 0, 0);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test022"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test023"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.schedule();
    schedule3.addProcess(2);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.upgradeProcessPrio(1, 0.0f);
    schedule3.upgradeProcessPrio(2, 0.0f);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test024"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test025"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test026"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test027"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test028"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test029"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test030"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test031"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test032"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test033"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test034"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test035"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test036"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test037"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test038"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test039"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test040"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test041"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test042"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test043"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test044"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test045"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test046"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test047"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test048"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test049"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test050"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test051"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test052"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test053"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test054"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test055"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test056"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test057"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test058"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test059"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test060"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test061"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test062"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test063"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test064"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test065"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test066"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test067"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test068"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test069"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test070"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test071"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test072"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test073"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test074"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test075"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test076"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test077"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test078"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test079"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test080"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test081"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test082"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test083"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test084"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test085"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test086"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test087"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test088"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test089"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test090"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test091"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test092"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test093"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test094"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test095"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test096"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test097"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test098"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test099"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test100"); }


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

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test101"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 0);
    schedule3.finishProcess();

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test102"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 0, 0);
    schedule3.finishProcess();

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test103"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.finishProcess();

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test104"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.finishProcess();

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test105"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 0, 2);
    schedule3.addProcess(1);
    schedule3.finishProcess();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test106"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(0, 2, 0);
    schedule3.addProcess(2);
    schedule3.finishProcess();

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","SchedulefinishProcess3Suite2.test107"); }


    casestudies.schedule.Schedule schedule3 = new casestudies.schedule.Schedule(2, 1, 0);
    schedule3.upgradeProcessPrio(2, 0.0f);
    schedule3.finishProcess();

  }

}
