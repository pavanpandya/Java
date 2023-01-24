package Operators_and_Expressions;

import java.util.Scanner;

public class Expressions {
    public static void main(String[] args) {
        float base,height,area;
        System.out.println("Enter Base and Height of the Triangle: ");

        Scanner sc=new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();

        area = (base * height) / 2;
        // Or area = (base * height) / 0.5f;
        // Or area = (base * height) * 1f/2f;

        System.out.println("Area of the Triangle is " + area);
    }
}
