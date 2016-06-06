package org.eim.codility.maxcounters;

import java.util.Arrays;

/**
 * @author eim
 * @since 2016-06-05
 */
public class MaxCounters {

  public static void main(String[] args) {
    MaxCounters m = new MaxCounters();
    int[] a = {3,4,4,6,1,4,4};
    int[] res = m.solution(5,a);
    System.out.println("============================================");
    Arrays.stream(res).forEach(i -> System.out.printf("%2d,",i));
    System.out.println("");
  }

  public int[] solution(int N, int[] A) {

    int[] a = new int[N];
    int N1 = N+1;
    int c = 0;
    int max = 0;
    for (int i=0;i<A.length;i++) {
      c = A[i];
      if (c > 0 && c<=N) {
        if ((a[c-1]++) > max) {
          max = a[c-1];
        }
      } else if (c == N1) {
        for (int k=0;k<a.length;k++) {
          a[k] = max;
        }
      }
      System.out.println("---------------------------------------------");
      Arrays.stream(a).forEach(j -> System.out.printf("%2d,",j));
      System.out.println("");
    }
    return a;
  }
}
