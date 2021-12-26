package com.aishwaryaK;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        multiple(10, 20, "Tori");
        fun(10,20,30,40);
    }

     static void multiple(int a, int b, String ...v) {
         System.out.println(Arrays.toString(v));
//         System.out.println(Arrays.toString(a));
//         System.out.println(b);

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    }

//    static void fun(int ...v) {
//        System.out.println(Arrays.toString(v));
//    }
//}//output gives an empty array since we havent initialised anything
