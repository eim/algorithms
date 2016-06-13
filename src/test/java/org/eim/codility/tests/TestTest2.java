package org.eim.codility.tests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eim
 * @since 2016-06-12
 */
public class TestTest2 {

  public Test2 tst2;

  @Before
  public void setUp() {
    tst2 = new Test2();
  }

  @Test
  public void test0() {
    int res = tst2.solution(12345,678);
    assertEquals(16273845,res);
  }


  @Test
  public void test1() {
    int res = tst2.solution(1,6789);
    assertEquals(16789,res);
  }


  @Test
  public void test2() {
    int res = tst2.solution(0,9);
    assertEquals(9,res);
  }


}
