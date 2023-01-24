package Loops;

import java.util.Scanner;

public class StudentChallenge6 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        // Display Multiplication Table
        System.out.println("Enter a number: ");
        int n=s.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n+"X"+i+"="+(n*i));
        }

        // Find Sum of n Numbers
        System.out.println("Enter a number: ");
        int num=s.nextInt(), sum=0;
        for (int j=1; j<=num; j++){
            sum = sum + j;
        }
        System.out.println("Sum of "+num+" numbers is "+sum);

        // Find a factorial of a number
        System.out.println("Enter a number: ");
        int number=s.nextInt();
        long fact=1;
        for (int k=1; k<=number; k++){
            fact = fact * k;
        }
        System.out.println("Factorial of "+number+" is "+fact);
    }
}
