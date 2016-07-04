package org.eim.codility.oddoccurrencesinarray;

import org.eim.codility.AbstractTest;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author eim
 * @since 2016-06-04
 */
public class TestSolution {

  OddOccurrencesInArray ooia = null;

  @Before
  public void setUp() {
    ooia = new OddOccurrencesInArray();
  }


  @Test
  public void testArrays0() {
    int[] a = {9,3,9,3,9,7,9};
    int r = ooia.solution(a);
    assertEquals("Unpaired value: ",7,r);
  }

  @Test
  public void testArrays1() {
    int[] a = {5,8,1,4,2,5,7,8,9,1,2,5,4,7,6,3,4,9,0,0,1,2};
    int r = ooia.solution(a);
    assertEquals("Unpaired value: ",5,r);
  }

  @Test
  public void testArrays2() {
    int[] a = {};
    int r = ooia.solution(a);
    assertEquals("Unpaired value: ",-1,r);
  }

  @Test
  public void testArrays3() {
    int[] a = {1};
    int r = ooia.solution(a);
    assertEquals("Unpaired value: ",1,r);
  }

  @Test
  public void testArrays4() {
    int[] a = {0,1,2,3,4,5,6};
    int r = ooia.solution(a);
    assertEquals("Unpaired value: ",0,r);
  }

}
