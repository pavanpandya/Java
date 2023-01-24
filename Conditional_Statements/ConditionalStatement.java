package Conditional_Statements;

public class ConditionalStatement {
    public static void main(String[] args) {

        // Relational Operators -- Return Boolean result.
        // <
        // <=
        // >
        // >=
        // ==
        // !=

        // Logical Operators -- To check multiple conditions.
        // &&, ||, !
        // A    B    A && B    A || B    !A
        // T    T      T         T        F
        // T    F      F         T        F
        // F    T      F         T        T
        // F    F      F         F        T

        int a=5, b=10, c=15;
        System.out.println(a<b);
        System.out.println(b>c);
        System.out.println((a<b) && (a<c));
        System.out.println((a<b) || (b>c));

        // Conditional Statements - Set of Statements which are executed based on the value of a condition.

        // Syntax:
        /*if (condition){
            // Code
        }else{
            // Code
        }*/

        // Example: Check if num is positive or negative
        if (a>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }

        // Nested-if
        // Syntax:
        /*if (condition){
            if (condition){
                // Code
            }else{
                // Code
            }
        }else{
            if (condition){
                // Code
            }else{
                // Code
            }
        }*/

        // Example - Find max of three numbers.

        if (a>b && a>c){
            System.out.println("A is maximum");
        }else{
            if(b>c){
                System.out.println("B is maximum");
            }else{
                System.out.println("C is maximum");
            }
        }

        // If-else ladder
        // Syntax:
        /*if (condition){
            // Code
        }else if (condition){
            // Code
        }else{
            // Code
        }*/

        // Example - Same as above
        if (a>b && a>c){
            System.out.println("A is maximum");
        }else if (b>c) {
            System.out.println("B is maximum");
        }else {
            System.out.println("C is maximum");
        }
    }
}
