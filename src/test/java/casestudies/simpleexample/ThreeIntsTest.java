package casestudies.simpleexample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ThreeIntsTest {

    @Test
    public void test0() {
        ThreeInts threeInts = new ThreeInts(1, 2, 3);
        threeInts.computeA();
        assertEquals(5, threeInts.getA());
    }

    @Test
    public void test1() {
        ThreeInts threeInts = new ThreeInts(4, 5, 6);
        threeInts.computeA();
        assertEquals(11, threeInts.getA());
    }

    @Test
    public void test2() {
        ThreeInts threeInts = new ThreeInts(7, 8, 9);
        threeInts.computeA();
        assertEquals(17, threeInts.getA());
    }

    @Test
    public void test3() {
        ThreeInts threeInts = new ThreeInts(10, 11, 12);
        threeInts.computeA();
        assertEquals(23, threeInts.getA());
    }

    @Test
    public void test4() {
        ThreeInts threeInts = new ThreeInts(1, -1, 3);
        threeInts.computeA();
        assertEquals(2, threeInts.getA());
    }

    @Test
    public void test5() {
        ThreeInts threeInts = new ThreeInts(1, 0, 0);
        threeInts.computeA();
        assertEquals(0, threeInts.getA());
    }

    @Test
    public void test6() {
        ThreeInts threeInts = new ThreeInts(-1, -2, -3);
        threeInts.computeA();
        assertEquals(-5, threeInts.getA());
    }

    @Test
    public void test7() {
        ThreeInts threeInts = new ThreeInts(-4, -5, -6);
        threeInts.computeA();
        assertEquals(-11, threeInts.getA());
    }

    @Test
    public void test8() {
        ThreeInts threeInts = new ThreeInts(-7, -8, -9);
        threeInts.computeA();
        assertEquals(-17, threeInts.getA());
    }
    
}