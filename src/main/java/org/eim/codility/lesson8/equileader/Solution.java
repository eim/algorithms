package org.eim.codility.lesson8.equileader;

import java.util.Arrays;

/**
 * @author eim
 * @since 2016-06-19
 */
public class Solution {

  private int leader = Integer.MAX_VALUE;
  private int fakeCounter = 0;

  private void tryAddLeader(int value) {
    if (value == leader) {
      fakeCounter++;
    } else {
      fakeCounter--;
      if (fakeCounter <= 0) {
        fakeCounter = 1;
        leader = value;
      }
    }
  }

  public int solution(int[] A) {

    for (int i : A) {
      tryAddLeader(i);
    }

    long counter = Arrays.stream(A).filter(i -> i == leader).count();
    if (counter <= A.length / 2)
      return 0;

    int leaderCount = 0;
    long backCounter = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == leader) {
        backCounter++;
      }
      if (backCounter > ((i + 1) / 2) && (counter - backCounter) > ((A.length - i - 1) / 2)) {
        leaderCount++;
      }
    }
    return leaderCount;
  }

}
