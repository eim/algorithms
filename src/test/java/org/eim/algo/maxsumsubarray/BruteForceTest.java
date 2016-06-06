package org.eim.algo.maxsumsubarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eim
 * @since 2016-06-05
 */
public class BruteForceTest {

  private BruteForce bruteForce = null;

  @Before
  public void setUp() {
    bruteForce = new BruteForce();
  }

  @Test
  public void testMSS() {
    int[] a = {3,-2,5,-1};
    long res = bruteForce.mss(a);
    assertEquals("Maxumus sub array.",6,res);
  }

  @Test
  public void testMSS_1() {
    int[] a = {-2,11,-4,13,-5,-2};
    long res = bruteForce.mss(a);
    assertEquals("Maxumus sub array.",20,res);
  }

  @Test
  public void testMSS0() {
    int[] a = {3,-2,5,-1};
    long res = bruteForce.mss0(a);
    assertEquals("Maxumus sub array.",6,res);
  }

  @Test
  public void testMSS0_1() {
    int[] a = {-2,11,-4,13,-5,-2};
    long res = bruteForce.mss0(a);
    assertEquals("Maxumus sub array.",20,res);
  }

}
