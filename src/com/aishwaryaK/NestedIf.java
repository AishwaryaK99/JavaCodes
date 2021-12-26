package com.aishwaryaK;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpId = in.nextInt();
        String Department = in.next();
        switch (EmpId){
            case 1:
                System.out.println("Aishwarya K");
                break;
            case 2:
                System.out.println("Tori");
                break;
            case 3:
                System.out.println("Emp no 3");
                switch (Department){
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Enter valid Department");
                }break;
            default:
                System.out.println("Enter valid EmpId");
        }
    }
}
