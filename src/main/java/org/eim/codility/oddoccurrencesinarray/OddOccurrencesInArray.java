package org.eim.codility.oddoccurrencesinarray;

import java.util.Arrays;

/**
 * @author eim
 * @since 2016-06-04
 */
public class OddOccurrencesInArray {

  public static void main(String[] args) {
    OddOccurrencesInArray ooia = new OddOccurrencesInArray();
    int[] a = {9,3,9,3,9,7,9};
    int r = ooia.solution(a);
    System.out.println("Result: "+r);
  }


  public int solution(int[] A) {
    int i=0;

    int unpaired = 0;
    for (int number : A) {
      System.out.println("--------------------------------------------------------------------------");
      System.out.printf("iter: %3d unpaired: %3d number: %3d Binary unp: %12s num: %12s\n", i, unpaired, number, Integer.toBinaryString(unpaired), Integer.toBinaryString(number));
      unpaired ^= number;
      System.out.printf("iter: %3d unpaired: %3d number: %3d Binary unp: %12s num: %12s\n", i, unpaired, number, Integer.toBinaryString(unpaired), Integer.toBinaryString(number));
      i++;
    }
    return unpaired;

//    int unPairIdx = 0;
//    boolean set = false;
//    if (A==null || A.length < 1) return -1;
//    int[][] pairs = new int[A.length][2];
//
//    for (int i=0; i<A.length; i++) {
//      set = false;
//      for (int k=unPairIdx;k<i;k++) {
//        // if not paired yet  and  value eq curr value
//        if (pairs[k][1] == -1 && pairs[k][0] == A[i]) {
//          pairs[k][1] = i;
//          pairs[i][1] = k;
//          set = true;
//          if (k == unPairIdx) {
//            while (unPairIdx < pairs.length && unPairIdx < (i+1) && pairs[unPairIdx][1] > -1) {
//              unPairIdx++;
//            }
//          }
//          break;
//        }
//      }
//
//      pairs[i][0] = A[i];
//      if (!set) {
//        pairs[i][1] = -1;
//      }
//      print(pairs,unPairIdx);
//    }
//
//    return A[unPairIdx];
  }

  private void print(int[][] p, int u) {
    System.out.println("---------------------------------");
    Arrays.stream(p).forEach(ints -> System.out.printf("[%3d] [%3d]\n",ints[0],ints[1]));
    System.out.println(".................................");
    System.out.printf("Unpaired: %3d\n",u);
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
  }

}
