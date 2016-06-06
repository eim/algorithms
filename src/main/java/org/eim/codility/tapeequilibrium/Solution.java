package org.eim.codility.tapeequilibrium;

import java.util.Arrays;

/**
 * @author eim
 * @since 2016-06-04
 */
public class Solution {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] a = {3,1,2,4,3};
    int res = sol.solution(a);
    System.out.println("Res: "+res);
  }

  public int solution(int[] A) {
    int diff = Integer.MAX_VALUE;
    int nsu = 0;
    int summ = Arrays.stream(A).sum();
    int tmp = 0;
    for (int i = 1; i<A.length; i++) {
      nsu += A[i-1];
      summ -= A[i-1];
      tmp = Math.abs(summ - nsu);
      if (tmp < diff) {
        diff = tmp;
      }

    }
    return diff;
  }

}
