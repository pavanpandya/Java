package Loops;

import java.util.Scanner;

public class DisplayGPSeries {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int a, r, n;
        System.out.println("Enter a, r and n: ");
        a=s.nextInt();
        r=s.nextInt();
        n=s.nextInt();

        int term=a;
        for (int i = 0; i < n ; i++) {
            System.out.print(term+" ");
            term=term*r;
        }
    }
}
