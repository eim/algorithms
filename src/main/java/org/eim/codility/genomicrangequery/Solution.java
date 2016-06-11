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

//  /**
//   * Worked solution but very slowly
//   * @param S
//   * @param P
//   * @param Q
//   * @return
//   */
//    public int[] solution(String S, int[] P, int[] Q) {
//        char[] gen = S.toCharArray();
//        int[] res = new int[P.length];
//
//        int min;
//        for (int i = 0; i < P.length; i++) {
//            min = Integer.MAX_VALUE;
//            for (int j = P[i]; j <= Q[i]; j++) {
//                switch (gen[j]) {
//                    case 'A': min = 1;
//                        break;
//                    case 'C': if(2 < min) min = 2;
//                        break;
//                    case 'G': if(3 < min) min = 3;
//                        break;
//                    case 'T': if(4 < min) min = 4;
//                        break;
//                }
//                if (min == 1) break;
//            }
//            res[i] = min;
//        }
//        return res;
//    }
//


    /**
     * Much better
     * @param S
     * @param P
     * @param Q
     * @return
     */
    public int[] solution(String S, int[] P, int[] Q) {
        char[] gen = S.toCharArray();
        int[] geni = new int[gen.length];

        for (int i = 0; i < gen.length; i++) {
            switch (gen[i]) {
                case 'A': geni[i] = 1;
                    break;
                case 'C': geni[i] = 2;
                    break;
                case 'G': geni[i] = 3;
                    break;
                case 'T': geni[i] = 4;
                    break;
            }
        }
        int[] res = new int[P.length];
        int[][] map = new int[4][geni.length];
        int[] mapi = new int[4]; // max position of the A,C ... in map

        int idx = 0;
        for (int i = 0; i < geni.length; i++) {
            idx = geni[i]-1;
            map[idx][mapi[idx]++] = i;
        }

        for (int i = 0; i < P.length; i++) {
            for (int j = P[i]; j <= Q[i]; j++) {

                for (int k = 0; k < 4; k++) {
                    for (int l = 0; l < mapi[k]; l++) {
                        if ( P[i] <= map[k][l] && map[k][l] <= Q[i] ) {
                            res[i] = (k+1);
                            break;
                        }
                    }
                    if (res[i] > 0) {
                        break;
                    }
                }
                if (res[i] > 0) {
                    break;
                }
            }
        }
        return res;
    }



}
