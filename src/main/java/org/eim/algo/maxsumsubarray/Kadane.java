package org.eim.algo.maxsumsubarray;

/**
 * @author eim
 * @since 2016-06-06
 */
public class Kadane {


  public long mss(int[] a, boolean allneg) {

    long sum=0;
    long ans=0;
    boolean allnegative=true;


    for (int i = 0; i < a.length; i++) {
      if (a[i] >= 0) {
        allnegative = false;
      }
      if (sum + a[i] > 0) {
        sum+=a[i];
      } else {
        sum=0;
      }
      ans = (sum>ans?sum:ans);
    }

    if (allnegative) {

    }

    return ans;
  }

}
