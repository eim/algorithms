package org.eim.codility.lesson7.fish;

/**
 * @author eim
 * @since 2016-06-11
 */
public class Solution {

  public int solution(int[] A, int[] B) {
    int f = -1; // previous i value
    int sum=A.length;
    int jump=0;
    int i = 0;
    int j = -1;

    for (; i < B.length && j < B.length;) {

      if (B[i] == 1) {
        if (f > -1) jump++;
        f = i;
      }
      if (B[i] == -1 || f < 0) {
        i++;
        continue;
      }

      if (i>=j) j = i+1;

      for (; j < B.length;) {
        if (B[j] == -1) {
          j++;
          continue;
        }
        if (B[j] == 1) {
          i++;
          break;
        }

        sum--;

        if(A[i] > A[j]) {
          System.out.printf("%2d > eat  %2d\n",A[i],A[j]);
          System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
          B[j] = -1;
          j++;
        } else {
          System.out.printf("%2d  eat < %2d\n",A[i],A[j]);
          System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
          B[i] = -1;
          f = -1;
          // search first "1" back if jump > 0
          if (jump>0) {
            for (;i >= 0;i--) {
              if (B[i] == 1) {
                jump--;
                break;
              }
            }
          } else {
            i = j + 1;
          }
          break;
        }
      }
    }
    return sum;
  }
}
