package Loops;

import java.util.Scanner;

public class DisplayAPSeries {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int a, d, n;
        System.out.println("Enter a (first term), d (common difference) and n (number of terms you want to display from the series):");
        a=s.nextInt();
        d=s.nextInt();
        n=s.nextInt();

        // Solution 1
        for(int i=1; i<=n; i++){
            System.out.print((a+(i-1)*d)+" ");
        }

        // Solution 2
        // int term=a;
        // for(int i=0; i<n; i++){
        //  System.out.print(term);
        //  term=term+d;
        // }
    }
}
