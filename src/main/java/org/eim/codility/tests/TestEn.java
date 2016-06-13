package org.eim.codility.tests;

/**
 * @author eim
 * @since 2016-06-12
 */
public enum TestEn {

  ONE,
  TWO;

  public void test() {
    System.out.println("1");
  }
  public static void test1() {
    System.out.println("2");
  }
}

class TstEn {

  public static void main(String[] args) {
    TestEn.test1();
//    TestEn.test(); // it doesn't allow
  }

}
