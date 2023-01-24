package Operators_and_Expressions;

import java.util.Scanner;
import static java.lang.Math.*;

public class FindRoots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double r1,r2; // as math.sqrt return value of "double" datatype.

        System.out.println("Enter the value of a, b and c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (- b + sqrt((b*b)-4*a*c)) / (2*a);
        r2 = (- b - sqrt((b*b)-4*a*c)) / (2*a);

        System.out.println("Roots of the equation are: " + r1 + " and " + r2);
    }
}
