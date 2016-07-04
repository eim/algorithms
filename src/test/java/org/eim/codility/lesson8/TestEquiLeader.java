package org.eim.codility.lesson8;

import org.eim.codility.lesson8.equileader.Solution;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author eim
 * @since 2016-07-02
 */
public class TestEquiLeader {

  private Solution solution;

  @Before
  public void setUp() {
    solution = new Solution();
  }

  @Test
  public void test0() {
    int[] A = {4, 3, 4, 4, 4, 2};
    int res = solution.solution(A);
    assertEquals(2,res);
  }

  @Test
  public void test1() {
    int[] A = {3, 4, 3, 3, 3, 2};
    int res = solution.solution(A);
    assertEquals(2,res);
  }

  @Test
  public void test2() {
    int[] A = {0, 0};
    int res = solution.solution(A);
    assertEquals(1,res);
  }

  @Test
  public void test3() {
    int[] A = {0};
    int res = solution.solution(A);
    assertEquals(0,res);
  }

  @Test
  public void test4() {
    int[] A = {3, 4, 3, 3, 1, 3, 3, 2, 3};
    int res = solution.solution(A);
    assertEquals(6,res);
  }

}
