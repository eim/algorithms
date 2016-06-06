package org.eim.codility.tests;

/**
 * @author eim
 * @since 2016-06-05
 */
public class PrefixSum {

  public static void main(String[] args) {
    PrefixSum ps = new PrefixSum();
    int[] a = {1,2,3,4,5,6,7,8,9};
    int res = ps.test(a);
    System.out.println("Res: "+res);
  }

  private int test(int[] a) {

    int n = a.length;
    int P = a[0] * (n+1);

    for (int k=1;k<(n+1);k++) {

    }

    return 0;
  }

}
