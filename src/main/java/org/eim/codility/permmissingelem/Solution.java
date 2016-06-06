package org.eim.codility.permmissingelem;

/**
 * @author eim
 * @since 2016-06-04
 */
public class Solution {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] a = {2};
    int res = sol.solution(a);
    System.out.println("Res: "+res);
  }


  public int solution(int[] A) {
    long sum = 0;
    long max = A.length + 1;
    for (int i: A) {
      sum += i;
    }
    return (int)(((max * (max + 1)) / 2) - sum);
  }

}
