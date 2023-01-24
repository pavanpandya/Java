package Loops;

import java.util.Scanner;

public class DisplayNumbers {

    public static void main(String[] args) {

        int num;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number that you want to display: ");
        num=s.nextInt();

        while (num!=0){
            System.out.println(num % 10);
            num = num/10;
        }

        // Count number of digits
        int n;
        System.out.println("Enter a number: ");
        n=s.nextInt();
        int count=0;
        while (n!=0){
            count += 1;
            n = n/10;
        }
        System.out.println("Number of digits = "+count);
    }
}
