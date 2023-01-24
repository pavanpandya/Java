package Loops;

import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int num, sum=0, rem, check;
        System.out.println("Enter a number: ");
        num=s.nextInt();
        check=num;

        while(num!=0){
            rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        if(check==sum){
            System.out.println("Armstrong Number"); // 153 is an armstrong number.
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
