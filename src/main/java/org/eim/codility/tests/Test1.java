package org.eim.codility.tests;

import java.math.BigInteger;

/**
 * @author eim
 * @since 2016-06-12
 */
public class Test1 {

  public static void main(String[] args) {
    Test1 tst1 = new Test1();
    int[] A = {-1,3,-4,5,1,-6,2,1};
    int res = tst1.solution(A);
    System.out.println("Res: "+res);
  }


  public int solution(int[] A) {
    BigInteger sum = BigInteger.ZERO;
    for (int i=0; i<A.length; i++) {
      sum = sum.add(BigInteger.valueOf(A[i]));
    }
    BigInteger mus = BigInteger.ZERO;
    for (int i=0; i<A.length; i++) {
      sum = sum.subtract(BigInteger.valueOf(A[i]));
      if (sum.equals(mus)) {
        return i;
      }
      mus = mus.add(BigInteger.valueOf(A[i]));
    }
    return -1;
  }

}
