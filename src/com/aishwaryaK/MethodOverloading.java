package com.aishwaryaK;

import static java.lang.Integer.sum;

public class MethodOverloading {
    public static void main(String[] args) {
     // fun(10);
      //  fun("tori");
       // int ans= sum(10,20);
//      int ans = sum(10,20)
//        System.out.println(ans);
    }
//static void fun(int a){
//    System.out.println(a);
//}
//    static void fun(String name){
//        System.out.println(name);
//    }

    static int main(int a, int b, int c){
        return a + b + c ;
    }
    static int main(int a, int b){
        return a + b;
    }
}
