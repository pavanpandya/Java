package Loops;

import java.util.Scanner;

public class ReverseANumber {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int num, rev=0;
        System.out.println("Enter a number: ");
        num=s.nextInt();
        int check=num;

        while(num!=0){
            rev=(rev*10)+(num%10);
            num=num/10;
        }
        System.out.println("Reverse of number is "+rev);

        // Check Palindrome
        if (rev==check) {
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }
    }
}
