package Conditional_Statements;

import java.util.Scanner;

public class StudentChallenge4 {
    public static void main(String[] args) {

        // Find if a number is even or odd
        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = s.nextInt();

        if (num%2==0){
            System.out.println("Number "+num+" is Even.");
        }else{
            System.out.println("Number "+num+" is Odd.");
        }

        // Find if a person is young(eg:- Age between 14-55) or not
        int age;
        System.out.println("Enter your age: ");
        age = s.nextInt();

        if (age>=14 && age<=55){
            System.out.println("You are young");
        }else {
            System.out.println("You are not young");
        }

        // Find grades for given marks
        int marks1, marks2, marks3;
        System.out.println("Enter your marks for each subjects: ");
        marks1 = s.nextInt();
        marks2 = s.nextInt();
        marks3 = s.nextInt();

        float total = marks1 + marks2 + marks3;
        float percentage = (total/300)*100;

        if (percentage>=75){
            System.out.println("A grade. Congratulations!!!");
        } else if (percentage<75 && percentage>=65) {
            System.out.println("B grade.");
        } else if (percentage<65 && percentage>=55) {
            System.out.println("C grade");
        } else if (percentage<55 && percentage>=40) {
            System.out.println("D grade");
        } else {
            System.out.println("Fail");
        }
    }
}
