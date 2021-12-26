package com.aishwaryaK;

import java.util.Scanner;

import static java.lang.Long.sum;

public class FunctionsSumOfTwoNum {
   // public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter num1:");
//        int num1 = in.nextInt();
//        System.out.print("Enter num2:");
//        int num2 = in.nextInt();
//        int sum = num1 +num2;
//        System.out.println("The sum is :"+sum);

        //If we want to call in function:
        public static void main(String[] args) {
            //the value of num1+num2 value will return the value and stores in ans variable
           int ans =  sum2();
            System.out.println(ans);
        }
//        static void Sum(){
//            Scanner in = new Scanner(System.in)
//            System.out.println("Enter the num1");
//            int num1 = in.nextInt();
//            System.out.println("Enter the num2");
//            int num2 = in.nextInt();
  //      }


    //Return function

    static int sum2(){
        Scanner in = new Scanner(System.in);
            System.out.println("Enter the num1");
           int num1 = in.nextInt();
            System.out.println("Enter the num2");
            int num2 = in.nextInt();
            int sum = num1 +num2;
             return sum;
    }
}
