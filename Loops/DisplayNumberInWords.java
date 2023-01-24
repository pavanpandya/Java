package Loops;

import java.util.Scanner;

public class DisplayNumberInWords {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int num;
        char rem;
        String str="";
        System.out.println("Enter a number: ");
        num=s.nextInt();
        int check=num;

        while(num!=0){
            str=str+(num%10);
            num=num/10;
        }

        System.out.println("Reverse of the number is "+str);

        for(int i=str.length()-1;i>=0;i--){
            rem=str.charAt(i);
            switch (rem){
                case '0':{
                    System.out.print("Zero ");
                    break;
                }
                case '1':{
                    System.out.print("One ");
                    break;
                }
                case '2':{
                    System.out.print("Two ");
                    break;
                }
                case '3':{
                    System.out.print("Three ");
                    break;
                }
                case '4':{
                    System.out.print("Four ");
                    break;
                }
                case '5':{
                    System.out.print("Five ");
                    break;
                }
                case '6':{
                    System.out.print("Six ");
                    break;
                }
                case '7':{
                    System.out.print("Seven ");
                    break;
                }
                case '8':{
                    System.out.print("Eight ");
                    break;
                }
                case '9':{
                    System.out.print("Nine ");
                    break;
                }
                default:{
                    System.out.println("Enter a valid number");
                    break;
                }
            }
        }
    }
}
