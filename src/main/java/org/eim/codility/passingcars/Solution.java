package org.eim.codility.passingcars;

/**
 * @author eim
 * @since 2016-06-09
 */
public class Solution {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] a = {0,1,0,1,1};
    int res = sol.solution(a);
    System.out.println("Res: "+res);
  }

  public int solution(int[] a) {
    int counter = 0;
    int zeros = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] == 0) {
        zeros++;
      } else if (a[i] == 1 && counter > -1) {
        counter += zeros;
      }
      if (counter > 1_000_000_000) {
        counter = -1;
      }
    }
    return counter;
  }

}
