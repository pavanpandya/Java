package Loops;

import java.util.Scanner;

public class DisplayFibonacciSeries {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=s.nextInt();

        int first_term=0;
        int second_term=1;
        int res;
        System.out.print(first_term+", "+second_term+", ");
        for (int i = 2; i < n; i++) {
              res=first_term+second_term;
            System.out.print(res+", ");
              first_term=second_term;
              second_term=res;
        }
    }
}
