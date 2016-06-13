package org.eim.codility.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author eim
 * @since 2016-06-12
 */
class Box<T> {
  T obj;

  public Box(T v) {
    obj = v;
  }

  public Box() {
  };
}

public class TestLog {




  public static void main(String[] args) {


//    Boolean  b1 = new Boolean(true);
//    Boolean b4  = new Boolean(b1);
//
//    Boolean  b2 = new Boolean(false);
//    Boolean b3  = new Boolean("false");
//
//    System.out.println(b1.equals(b4));
//    System.out.println(b2 == b3);
//    System.out.println(b1 == b4);


//    Box<String> b0 = new Box<String>("1");
//    Object<String> b2 = new Box<String>("1");
//    Box<String> b3 = new Box("3");
//    Box b4 = new Box<String>("1");
//    Object b5 = new Box<Object>();


//    Thread th1 = new Thread() {
//      public void run() {
//        for (int i = 0; i < 5; i++) {
//          System.out.println("111");
//        }
//      }
//    };
//
//    Thread th2 = new Thread() {
//      public void run() {
//        for (int i = 0; i < 5; i++) {
//          System.out.println("2");
//        }
//      }
//    };
//
//    th1.start();
//    try {
//      th1.join();
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//    th2.start();


//    HashMap<Integer,String> hm = new HashMap<>();
//    String s1 = "1";
//    hm.put(1,s1);
//    hm.put(2,"2");
//
//    String s2 = hm.get(1);
//    System.out.println((s1.equals(s2))  + " "+ (s1 == s2));

//    Set<Integer> n = new HashSet<>();
//    n.add(3);
//    n.add(1);
//    n.add(2);
//    System.out.println(n);
//
//    Set<Integer> n1 = new LinkedHashSet<>();
//    n1.add(3);
//    n1.add(1);
//    n1.add(2);
//    System.out.println(n1);

//    List<String> ll = new ArrayList<>();
//    callNone(ll);
//    System.out.println(ll.get(1));
//    TestLog tl = new TestLog();
//    char[] arr = "hello world".toCharArray();
//
//    tl.test(arr);
  }

//  public void test(char[] a) {
//    int left = 0;
//        int right = a.length-1;
//    char s;
//    for (;left<right;) {
//      s = a[left];
//      a[left] = a[right];
//      a[right--] = s;
//      left++;
//    }
//
//    System.out.println(String.valueOf(a));
//  }

//
//  public static void callNone(List<String> ll) {
//    ll.add(123);
//    ll.add("123");
//
//  }

  public int test() {return 0;};

}
