package org.eim.codility.cyclicrotation;


//
//    A zero-indexed array A consisting of N integers is given. Rotation of the array means that
//    each element is shifted right by one index, and the last element of the array is also moved
//    to the first place.
//
//    For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to
//    rotate array A K times; that is, each element of A will be shifted to the right by K indexes.
//
//    Write a function:
//
//    class Solution { public int[] solution(int[] A, int K); }
//
//    that, given a zero-indexed array A consisting of N integers and an integer K, returns the
//    array A rotated K times.
//
//    For example, given array A = [3, 8, 9, 7, 6] and K = 3,
//    the function should return [9, 7, 6, 3, 8].
//
//    Assume that:
//
//    N and K are integers within the range [0..100];
//    each element of array A is an integer within the range [−1,000..1,000].
//    In your solution, focus on correctness. The performance of your solution will not be the
//    focus of the assessment.

import java.util.Arrays;

/**
 * @author eim
 * @since 2016-06-04
 */
public class CyclicRotation {

  public static void main(String[] args) {
    CyclicRotation cr = new CyclicRotation();
    int[] a = {3, 8, 9, 7, 6};
    a = cr.solution(a,3);
    cr.print(a);

    a = new int[]{1,2,3,4,5};
    a = cr.solution(a,3);
    cr.print(a);

    a = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
    a = cr.solution(a,5);
    cr.print(a);
  }


  public int[] solution(int[] A, int K) {
    if (A == null || A.length < 2 || K == 0) return A;

    K = ( K > A.length ? K % A.length : K);
    if (K==0) return A;

    int[] tmp = new int[K];

    int K1=0;
    // store last elements in temporary array
    for (;K1<K;K1++) {
      tmp[K1] = A[A.length - K + K1];
    }

    // shift values
    for (int i=(A.length - 1 - K1);i>=0;i--) {
      A[i+K1] = A[i];
    }

    // copy elements from temporary array into begin of the source array
    for(int i=0;i<tmp.length;i++) {
      A[i] = tmp[i];
    }

    return A;
  }

  private void print(int[] a) {
    Arrays.stream(a).forEach(i -> System.out.print(i));
    System.out.println("");
  }

}
