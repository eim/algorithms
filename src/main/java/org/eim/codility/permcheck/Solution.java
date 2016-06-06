package org.eim.codility.permcheck;


/**
 * @author eim
 * @since 2016-06-05
 */
public class Solution {

  public static void main(String[] args) {
    Solution sol = new Solution();
    int[] a = {4,1,3,2};
    int res = sol.solution(a);
    System.out.println("Res: "+res);

    a = new int[]{3,1,3,2};
    res = sol.solution(a);
    System.out.println("Res: "+res);

    a = new int[]{};
    res = sol.solution(a);
    System.out.println("Res: "+res);

    a = new int[]{3,1};
    res = sol.solution(a);
    System.out.println("Res: "+res);
  }

  public int solution(int[] A) {
    if (A == null || A.length < 2) return 0;
    boolean[] used = new boolean[A.length];
    for (int i=0; i<A.length; i++) {
      if (A[i] < 1 || A[i] > A.length || used[A[i]-1]) {
        return 0;
      }
      used[A[i]-1] = true;
    }
    return 1;
  }

}
