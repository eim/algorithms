package org.eim.algo.maxsumsubarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eim
 * @since 2016-06-06
 */
public class DivideAndConquerTest {

  private DivideAndConquer dac = null;

  @Before
  public void setUp() {
    dac = new DivideAndConquer();
  }

  @Test
  public void test0() {
    int[] a = {-2, -5, 6, -2, -3, 1, 5, -6};
    long res = dac.mss(a,0,a.length-1);
    System.out.println("Res: "+res);
    assertEquals("DAC ",7,res);
  }

}
