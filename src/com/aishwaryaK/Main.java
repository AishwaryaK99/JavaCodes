package com.aishwaryaK;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // String fruits = in.next();
//
//        switch (fruits) {
//            case "Apple" -> System.out.println("its round");
//            case "Orange" -> System.out.println("its Round");
//            case "Grapes" -> System.out.println("its small");
//            default -> System.out.println("Enter the valid number");
//        }
        //Numbers of week days
// int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter valid day");
//        }


        //weekdays and weekend
        int day = in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
        }


        //int day = in.nextInt();
        //        switch (day) {
        //            case 1 :
        //            case 2 :
        //            case 3 :
        //            case 4 :
        //            case 5 :
        //                System.out.println("weekday");
        //                break;
        //            case 6:
        //            case 7:
        //                System.out.println("weekend");
        //                break;
    }
}
