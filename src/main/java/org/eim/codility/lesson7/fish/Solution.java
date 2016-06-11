package org.eim.codility.lesson7.fish;

/**
 * @author eim
 * @since 2016-06-11
 */
public class Solution {

  public int solution(int[] A, int[] B) {
    int f = -1;
    int sum=A.length;
    int jump=0;
    for (int i = 0; i < B.length; i++) {
      if (B[i] == -1) continue;
      if (B[i] == 1) {
        if (f > -1) jump++;
        f = i;
      } else {
        if (f < 0 ) {
          continue;
        }
        for (int j = i; j < B.length; j++) {
          if (B[j] == -1) continue;
          if (B[j] == 1) {
            if (f > -1) jump++;
            f = -1;
            break;
          }
            if(A[f] > A[j]) {
              System.out.printf("%2d > eat  %2d\n",A[f],A[j]);
              System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
              B[j] = -1;
              sum--;
            } else {
              sum--;
              System.out.printf("%2d  eat < %2d\n",A[f],A[j]);
              System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
              B[f] = -1;
              int b = f;
              f = -1;
              // search first "1" back if jump > 0
              if (jump>0) {
                for (; b >= 0; b--) {
                  if (B[b] == 1) {
                    i = b - 1;
                    jump--;
                    break;
                  }
                }
              } else {
                i = j - 1;
              }
              break;
            }
        }
      }
    }
    return sum;
  }

//  public int solution(int[] A, int[] B) {
//    int f = -1, s = -1;
//    int sum=A.length;
//    s = B.length>1?1:0;
//    f = 0;
//    while (true) {
//      if (f == -1 || s == -1) break;
//        if (B[f] > B[s]) { //
//          if (A[f] > A[s]) {
//            // A[i] eats A[i+1]. A[i] survived
//            A[s] = -1;
//            B[s] = A[s];
//            sum--;
//            s = getNext(B,s);
//          } else {
//            // A[i+1] eats A[i]. A[i+1] survived
//            A[f] = -1;
//            B[f] = A[f];
//            sum--;
//            f = getNext(B,s+1);
//            s = getNext(B,f+1);
//          }
//        } else {
//          f = getNext(B,s);
//          s = getNext(B,f+1);
//        }
//    }
//    return sum;
//  }

}
