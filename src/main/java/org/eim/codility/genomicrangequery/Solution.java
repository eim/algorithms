package org.eim.codility.genomicrangequery;

/**
 * Created by eugene on 6/9/16.
 */
public class Solution {


    public static void main(String[] args) {
        int[] P = {2,5,0};
        int[] Q = {4,5,6};

        Solution sol = new Solution();
        int[] res = sol.solution("CAGCCTA",P,Q);
        System.out.println("Res: "+res.toString());
    }

    public int[] solution(String S, int[] P, int[] Q) {
        char[] gen = S.toCharArray();
        int[] res = new int[P.length];
        int min;
        for (int i = 0; i < P.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = P[i]; j <= Q[i]; j++) {
                switch (gen[j]) {
                    case 'A': min = 1;
                        break;
                    case 'C': if(2 < min) min = 2;
                        break;
                    case 'G': if(3 < min) min = 3;
                        break;
                    case 'T': if(4 < min) min = 4;
                        break;
                }
                if (min == 1) break;
            }
            res[i] = min;
        }
        return res;
    }

//
//    public int[] solution(String S, int[] P, int[] Q) {
//        char[] gen = S.toCharArray();
//        int[] res = new int[P.length];
//        int min;
//        for (int i = 0; i < P.length; i++) {
//            min = Integer.MAX_VALUE;
//            for (int j = P[i]; j <= Q[i]; j++) {
//                if (gen[j] == 'A') {
//                    min = 1;
//                    break;
//                } else if (gen[j] == 'C') {
//                    if (2 < min) min = 2;
//                } else if (gen[j] == 'G') {
//                    if (3 < min) min = 3;
//                } else {
//                    min = 4;
//                }
//            }
//            res[i] = min;
//        }
//        return res;
//    }

}
