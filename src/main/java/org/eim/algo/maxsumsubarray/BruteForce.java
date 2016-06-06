package org.eim.algo.maxsumsubarray;

/**
 * @author eim
 * @since 2016-06-05
 */
public class BruteForce {

  public long mss(int[] a) {
    long ans = Integer.MIN_VALUE;
    // Iterate through
    for (int i = 0; i < a.length; i++) {
      for (int j = i; j < a.length; j++) {
        if ((i+j)>a.length) { //Subarray exceed array bounds
          break;
        }

        long sum=0;
        for (int k = i; k < j; k++) {
          sum+=a[k];
        }
        ans = (sum>ans?sum:ans);
      }
    }
    return ans;
  }

  public long mss0(int[] a) {
    long ans = Integer.MIN_VALUE;
    // Iterate through
    for (int i = 0; i < a.length; i++) {
      long sum=0;
      for (int j = i; j < a.length; j++) {
        sum+=a[j]; //Last element of new subarray
        ans = (sum>ans?sum:ans);
      }
    }
    return ans;
  }

}
