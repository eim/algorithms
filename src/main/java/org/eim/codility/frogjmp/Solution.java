package org.eim.codility.frogjmp;

/**
 * @author eim
 * @since 2016-06-04
 */
public class Solution {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int res = sol.solution(10, 85, 30);
    System.out.println(res);
  }


  public int solution(int X, int Y, int D) {
    if (Y<=X) return 0;

    if (D < 1) return 0;

    int r = (Y-X)/D;

    if ((Y-X) > (D*r)) {
      r++;
    }

    return r;
  }

}