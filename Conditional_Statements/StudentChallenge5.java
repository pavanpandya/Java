package Conditional_Statements;

import java.util.Scanner;

public class StudentChallenge5 {
    public static void main(String[] args) {

        // Find radix of a number given in a string
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string (in radix form)");
        str = s.nextLine();
        if (str.matches("[01]+")){
            System.out.println("Binary Number System -- Radix=2");
        } else if (str.matches("[0-7]+")) {
            System.out.println("Octal Number System -- Radix=8");
        } else if (str.matches("[0-9]+")) {
            System.out.println("Decimal Number System -- Radix=10");
        } else if (str.matches("[A-F0-9]+")) {
            System.out.println("Hexadecimal Number System -- Radix=16");
        } else {
            System.out.println("Invalid number");
        }

        // Find a given year is a leap year or not
        // Leap Year -- It should be divisible by 4, and If it is divisible by 100 then it should be divisible by 400.
        int year;
        System.out.println("Enter a year: ");
        year = s.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
