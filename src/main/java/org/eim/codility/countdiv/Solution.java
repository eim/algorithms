package org.eim.codility.countdiv;

/**
 * Created by eugene on 6/9/16.
 */
public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int res = sol.solution(6,11,2);
        System.out.println("Res: "+res);
    }

    public int solution(int A, int B, int K) {
        if (A==B) return ((A % K) == 0?1:0);
        long FR = B/K;
        int SR = 0;
        if (A>=K) {
            SR = (A-1)/K;
        }
        return (int)(FR-SR)+(A==0?1:0);
    }

}
