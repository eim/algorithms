package org.eim.codility.tests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eim
 * @since 2016-06-12
 */
public class TestTestLog {

  private TestLog tl = null;

  @Before
  public void setUp() {
    tl = new TestLog();
  }

  @Test
  public void test0() {
    int res = tl.test();
    assertEquals(0,res);
  }


  @Test
  public void test1() {
    int res = tl.test();
    assertEquals(0,res);
  }

  @Test
  public void test2() {
    int res = tl.test();
    assertEquals(0,res);
  }

}
