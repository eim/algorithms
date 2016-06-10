package org.eim.codility.countdiv;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by eugene on 6/9/16.
 */
public class TestSolution {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test0() {
       int res = solution.solution(6,11,2);
       assertEquals(3,res);
    }

    @Test
    public void test1() {
        int res = solution.solution(11, 345, 17);
        assertEquals(20,res);
    }

    @Test
    public void test2() {
        int res = solution.solution(0,Integer.MAX_VALUE,1);
        assertEquals(Integer.MAX_VALUE,res);
    }

    @Test
    public void test3() {
        int res = solution.solution(0,Integer.MAX_VALUE,Integer.MAX_VALUE);
        assertEquals(2,res);
    }

    @Test
    public void test4() {
        int res = solution.solution(0,0,11);
        assertEquals(1,res);
    }
}
