package org.eim.codility.missinginteger;

/**
 * @author eim
 * @since 2016-06-05
 */
public class Solution {

  public static void main(String[] args) {
    Solution sol = new Solution();

    int[] a = {1,3,6,4,1,2};
    int res = sol.solution(a);
    System.out.println("Res: "+res);

    a = new int[]{2};
    res = sol.solution(a);
    System.out.println("Res: "+res);

    a = new int[]{2147483647};
    res = sol.solution(a);
    System.out.println("Res: "+res);

    a = new int[]{1};
    res = sol.solution(a);
    System.out.println("Res: "+res);

  }

  public int solution(int[] A) {

    boolean[] used = new boolean[A.length];
    int cv = 0;
    for (int i=0;i<A.length;i++) {
      cv = A[i];
      if (cv > 0 && cv <= A.length && !used[cv-1]) {
        used[cv-1]=true;
      }
    }

    for (int i=0;i<used.length;i++) {
      if (!used[i]) {
        return i+1;
      }
    }

    return A.length + 1;
  }

}
