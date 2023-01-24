package Conditional_Statements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        // Also, Known as Branch and Control Statements.

        int day;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a day number: ");
        day = s.nextInt();

        // In the parenthesis, we can mention any variable or any expression.
        switch (day){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System.out.println("Enter a correct day number.");
                break;
            }
        }

        // Pointers:
        // 1. Every case must end with a "break;" else it will execute all the remaining cases. This condition is known as "Fall through".
        // 2. How it works? Let's say day=3; So directly it will jump on case number 3 and will execute the code and because of break, it will come out of the switch case.
        // 3. You can write the cases in any order.
        // 4. After "case", we can only write 'byte', 'short', 'int', 'char', 'string' type of values.
        // Example: 1. case 13:
        //          2. case 'a':
        //          3. case "file":
        // 5. Switch Case are useful for developing Menu Driven program.
        // 6. Working of both Switch Case and If condition is same but the time taken by switch case is less compare to if conditions as it directly jumps on to the particular case and execute the code
        // whereas in if condition, it checks all the given conditions.
    }
}
