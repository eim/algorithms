package org.eim.codility.sequence;

//
//    A binary gap within a positive integer N is any maximal sequence of consecutive zeros that
//    is surrounded by ones at both ends in the binary representation of N.
//
//    For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
//    The number 529 has binary representation 1000010001 and contains two binary gaps: one of
//    length 4 and one of length 3. The number 20 has binary representation 10100 and contains one
//    binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
//
//    Write a function:
//
//    class Solution { public int solution(int N); }
//
//    that, given a positive integer N, returns the length of its longest binary gap. The function
//    should return 0 if N doesn't contain a binary gap.
//
//    For example, given N = 1041 the function should return 5, because N has binary
//    representation 10000010001 and so its longest binary gap is of length 5.
//
//    Assume that:
//
//    N is an integer within the range [1..2,147,483,647].
//    Complexity:
//
//    expected worst-case time complexity is O(log(N));
//    expected worst-case space complexity is O(1).


/**
 * @author eim
 * @since 2016-06-04
 */
public class ZeroSeq {


  private static final int[] _SOURCE = {4,0,4,0,0,5,1,9,5,6,34,23,0,0,0,7,0,0,11,23,56,0,0,0,0,0,0,0};

  public static void main(String[] args) {
    ZeroSeq.solution(9);
    ZeroSeq.solution(1041);
    ZeroSeq.solution(6);
    ZeroSeq.solution(328);
    ZeroSeq.solution(51712);
  }

  public static int solution(int N) {
    String val = Integer.toBinaryString(N);
    System.out.println(val);
    char[] SOURCE = val.toCharArray();

    int BIGGEST = 0; // lenght of the sequence
    int INDEX = 0;   // start index of longest sequence
    int START = 0;   // start index of the current sequence
    int[] LENGHTS = new int[SOURCE.length]; //
    byte prior = -1; // -1 - unoknown, 0 - not found, 1 - found

    for (int i=0;i < SOURCE.length; i++) {
      if (SOURCE[i] == '0') {
        if (prior == 0) {
          START = i;
        }
        LENGHTS[START] = LENGHTS[START] + 1;
        prior = 1;
      } else {
        if (prior == 1) {
          if (LENGHTS[START] > BIGGEST) {
            BIGGEST = LENGHTS[START];
            INDEX = START;
          }
        }
        prior = 0;
      }
    }

    System.out.println("Value: "+N+" BV: "+BIGGEST+" at IDX: "+INDEX);
    return BIGGEST;
  }

}
