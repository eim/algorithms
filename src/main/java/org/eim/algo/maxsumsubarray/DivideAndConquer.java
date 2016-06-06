package org.eim.algo.maxsumsubarray;

/**
 * @author eim
 * @since 2016-06-06
 */
public class DivideAndConquer {

  public long mss(int[] a, int s, int f) {
    if (a == null) return 0;
    if (s == f) return a[s];
    if (a.length == 1) return a[0];

    int m = (f-s)/2 + s;
    long left_mss = mss(a,s,m);
    long right_mss = mss(a,m+1,f);

    long left_sum = Long.MIN_VALUE, right_sum = Long.MIN_VALUE, sum=0;

    for (int r = m+1; r <= f; r++) {
      sum+=a[r];
      right_sum = (sum>right_sum?sum:right_sum);
    }

    sum=0;

    for (int l = m; l >= s; l--) {
      sum+=a[l];
      left_sum = (sum>left_sum?sum:left_sum);
    }

    left_sum += right_sum;
    long ans = (left_mss>right_mss?left_mss:right_mss);
    return (ans>left_sum?ans:left_sum);
  }

}
