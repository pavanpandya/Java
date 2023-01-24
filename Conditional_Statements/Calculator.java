package Conditional_Statements;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        // Make a menu driven program for arithmetic operations.
        System.out.println("Menu \n1. Add\n2. Sub\n3. Mul\n4. Div\n5. Modulo");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("Enter operation from menu in words: ");
        // Here, it is not taking the input because when you enter two numbers and press enter. It will be stored in the buffer.
        // Thus, to avoid this problem write s.nextline();
        s.nextLine();
        String operation = s.nextLine(); // Now, It will work normally.

        switch (operation){
            case "Add":{
                System.out.println("Addition of "+a+" and "+b+" is = "+(a+b));
                break;
            }
            case "Sub":{
                System.out.println("Subtraction of "+a+" from "+b+" is = "+(a-b));
                break;
            }
            case "Mul":{
                System.out.println("Multiplication of "+a+" and "+b+" is = "+(a*b));
                break;
            }
            case "Div":{
                System.out.println("Division of "+a+" from "+b+" is = "+(a/b));
                break;
            }
            case "Modulo":{
                System.out.println(a+"%"+b+" is = "+(a%b));
                break;
            }
            default:{
                System.out.println("Enter correct operation from the MENU");
                break;
            }
        }

    }
}
