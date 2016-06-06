package org.eim.codility.frogriverone;

/**
 * @author eim
 * @since 2016-06-05
 */
public class Solution {

  public static void main(String[] args) {
    Solution sol = new Solution();

    int[] a = {1,3,1,4,2,3,5,4};
    int res = sol.solution(5,a);
    System.out.println("Res: "+res);

    a = new int[0];
    res = sol.solution(5,a);
    System.out.println("Res: "+res);

    a = new int[]{1};
    res = sol.solution(5,a);
    System.out.println("Res: "+res);

  }

  public int solution(int X, int[] A) {
    if (A == null || A.length == 0 || A.length < X)
      return -1;

    int counter = X;
    boolean[] arr = new boolean[X];

    for (int i=0; i<A.length; i++) {
      if (A[i] <= X) {
        if (!arr[(A[i]) - 1]) {
          counter--;
          arr[(A[i]) - 1] = true;

          if (counter == 0) {
            return i;
          }
        }
      }
    }

    return -1;
  }

}
