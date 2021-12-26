package com.aishwaryaK;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isAmstrong(n);
        System.out.println(ans);
    }

     static boolean isAmstrong(int n) {
         int original = n;
         int sum = 0;

         while (n>0){
             int rem = n %10;
             n = n / 10;
             sum = sum + rem * rem * rem;
         }
        return sum == original;
     }

}
