package org.eim.codility.lesson7.fish;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eim
 * @since 2016-06-11
 */
public class TestFish {

  private Solution sol;

  @Before
  public void setUp() {
    sol = new Solution();
  }


  @Test
  public void test0() {
    int[] A = {};
    int[] B = {};
    int res = sol.solution(A,B);
    assertEquals(0,res);
  }

  @Test
  public void test1() {
    int[] A = {4,3,2,1,5};
    int[] B = {0,1,0,0,0};
    int res = sol.solution(A,B);
    assertEquals(2,res);

  }

  @Test
  public void test2() {
    int[] A = {4,3,2,1,5,1,9,4,6,7,2,3,4,9,8,0};
    int[] B = {0,1,0,0,0,0,0,1,1,1,1,0,1,0,0,1};
    int res = sol.solution(A,B);
    assertEquals(7,res);
  }

  @Test
  public void test3() {
    int[] A = {4};
    int[] B = {0};
    int res = sol.solution(A,B);
    assertEquals(1,res);
  }

  @Test
  public void test4() {
    int[] A = {4};
    int[] B = {1};
    int res = sol.solution(A,B);
    assertEquals(1,res);
  }

  @Test
  public void test5() {
    int[] A = {9,1,2,3,4,5,6,7,8};
    int[] B = {1,0,0,0,0,0,0,0,0};
    int res = sol.solution(A,B);
    assertEquals(1,res);
  }

  @Test
  public void test6() {
    int[] A = {8,7,6,5,4,3,2,1,9};
    int[] B = {1,1,1,1,1,1,1,1,0};
    int res = sol.solution(A,B);
    assertEquals(1,res);
  }

  @Test
  public void test7() {
    int[] A = {9,1,2,3,4,5,6,7,8,8,7,6,5,4,3,2,1,10,11};
    int[] B = {1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,0,0};
    int res = sol.solution(A,B);
    assertEquals(2,res);
  }
}
