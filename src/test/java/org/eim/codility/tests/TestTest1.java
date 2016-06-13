package org.eim.codility.tests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eim
 * @since 2016-06-12
 */
public class TestTest1 {

  public Test1 tst1;

  @Before
  public void setUp() {
    tst1 = new Test1();
  }

  @Test
  public void test0() {

    int[] A = {-1,3,-4,5,1,-6,2,1};
    int res = tst1.solution(A);
    assertEquals(1,res);

  }

  @Test
  public void test1() {

    int[] A = {-1};
    int res = tst1.solution(A);
    assertEquals(0,res);

  }

  @Test
  public void test2() {

    int[] A = {-1,1};
    int res = tst1.solution(A);
    assertEquals(-1,res);

  }

  @Test
  public void test3() {

    int[] A = {};
    int res = tst1.solution(A);
    assertEquals(-1,res);

  }

}
