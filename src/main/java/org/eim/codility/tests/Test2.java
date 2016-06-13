package org.eim.codility.tests;

import java.math.BigInteger;

/**
 * @author eim
 * @since 2016-06-12
 */
public class Test2 {

  public static void main(String[] args) {
    Test2 tst2 = new Test2();
    int[] A = {};
    int res = tst2.solution(-1,678);
    System.out.println("Res: "+res);
  }

  public int solution(int A, int B) {
    char[] aa = new char[0];
    if (A > -1) {
      aa = String.valueOf(A).toCharArray();
    }
    char[] bb = new char[0];
    if (B > -1) {
      bb = String.valueOf(B).toCharArray();
    }

    int l = aa.length < bb.length?aa.length:bb.length;
    StringBuilder sb = new StringBuilder();
    for (int i=0;i<l;i++) {
      append(sb,aa[i]);
      append(sb,bb[i]);

    }
    if (aa.length > l) {
      for (int i = l; i < aa.length; i++) {
        append(sb,aa[i]);
      }
    } else if (bb.length > l) {
      for (int i = l; i < bb.length; i++) {
        append(sb,bb[i]);
      }
    }

    if (sb == null || sb.length() < 1) {
      return 0;
    }

    BigInteger res = new BigInteger(sb.toString());

    if (res.longValue() > 100_000_000) {
      return -1;
    }

    return res.intValue();
  }

  private void append(StringBuilder sb, char v) {
    if (Character.isDigit(v)) {
      sb.append(v);
    }
  }


//  public int solution(int A, int B) {
//    char[] aa = new char[0];
//    if (A > -1) {
//      aa = String.valueOf(A).toCharArray();
//    }
//    char[] bb = new char[0];
//    if (B > -1) {
//       bb = String.valueOf(B).toCharArray();
//    }
//
//    int l = aa.length < bb.length?aa.length:bb.length;
//    StringBuilder sb = new StringBuilder();
//    for (int i=0;i<l;i++) {
//      append(sb,aa[i]);
//      append(sb,bb[i]);
//    }
//    if (aa.length > l) {
//      for (int i = l; i < aa.length; i++) {
//        append(sb,aa[i]);
//      }
//    } else if (bb.length > l) {
//      for (int i = l; i < bb.length; i++) {
//        append(sb,bb[i]);
//      }
//    }
//
//    if (sb.length() < 1) {
//      return 0;
//    }
//
//    BigInteger b = new BigInteger(sb.toString());
//
//    if (b.longValue() > 100_000_000) {
//      return -1;
//    }
//
//    return (int)b.intValue();
//  }
//
//
//  private void append(StringBuilder sb, char v) {
//    if (Character.isDigit(v)) {
//      sb.append(v);
//    }
//  }

}
