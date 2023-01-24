// Java has a built-in class named "System" that has built-in object called "out". This Static object is attached to the monitor (Standard Output or Console).

// Various Available Methods:
// 1. System.out.print() - Just Print.
// 2. System.out.println() - Print and move the cursor to the next line.
// 3. System.out.printf()
// 4. System.out.format() - Same as printf()

package String_Class_and_Printing;

public class PrintMethods {
    public static void main(String[] args) {
        int x = 10, y = 20;

        // First, the expression is evaluated and then the result is printed.
        System.out.println(x + y);
        // Here, we have one of the value has string literal and thus, "+" acts as a concatenation operation.
        System.out.println("Number is " + x);

        // Important Pointers:

        // 1. Here, First "+" is for adding two integer literal. Thus, it would print 30 and then, the second "+" is
        // with string literal and therefore, it will act as concatenation.
        System.out.println(x + y + " Sum"); // Output - 30 Sum

        // 2. Here, First "+" is between a string literal and integer literal and therefore, concatenation will take place.
        // Again, there is string literal i.e "Sum 10" and integer literal and thus, again it will act as concatenation.
        System.out.println("Sum " + x + y); // Output - Sum 1020

        // To Resolve the issue in 2nd print statement-Use Parenthesis to increase the precedence.
        System.out.println("Sum " + (x + y)); // Output - Sum 30

        // Output - Sum of 10 and 20 is 30
        System.out.println("Sum of " + x + " and " + y + " is " + (x + y));

        // ------------------------------------------------------------------------------------------

        System.out.print("Hello, I am using printf.\n");

        int a = 13;
        float b = 13.11f;
        char ch = 'P';
        String str="Java Program";

        System.out.printf("Hello %d %f %c World\n", a, b, ch);

        // Format Specifier:

        // Syntax: %[argument_index$][flags][width][.precision]conversion

        // argument index - 1$, 2$, 3$.....
        // flag - '-', '+', '0', '', '('
        // conversion -
        // 1. char --> c
        // 2. int --> d (for decimal), o (for octal), x (for hexadecimal)
        // 3. float --> f, e, g
        // 4. String -->s

        System.out.printf("Hello %o %g %c World\n", a, b, ch);

        //  Printing the float number in scientific manner
        System.out.printf("Hello %e\n", b);

        System.out.printf("Hello, Printing the String - %s\n", str);

        // Demonstration of Format Specifier:
        // Here, you can write arguments in any order, and you can use them in printing at any place by giving that index.
        System.out.printf("%1$d %2$f %1$d\n", a, b); // '1$' means 'x' and '2$' means 'b'. 'd' and 'f' are used to print int and float number respectively.

        System.out.printf("%3$s %2$f %1$d\n", a, b, str);

        // Using Width
        System.out.printf("%5d\n", a);

        // Using Flag - Use 0 if empty space.
        System.out.printf("%05d\n", a);

        int n=-10;
        System.out.printf("%(5d\n", n); // Shows bracket like this --> (10). If -ve number.
        System.out.printf("%(5d\n", a); // Works normally (without bracket).

        System.out.printf("%+5d\n", n); // Prints -10 as it is -ve number.
        System.out.printf("%+5d\n", a); // Prints +13 as it is +ve number.

        float m=123.45f;
        System.out.printf("%f\n", m);
        // Note: If the number is bigger, it will take all the necessary places and won't limit itself to 6 places (%6f)
        System.out.printf("%6.2f\n", m); // Using '.2' because, after decimal we only want 2 digits.
        System.out.printf("%6.2f\n", m); // If the number is small, it will fill the empty spaces with 0.

        String s = "Pavan";
        System.out.printf("%s\n", s);
        System.out.printf("%10s\n", s); // First Spaces, then String.
        System.out.printf("%-10s\n", s); // First String, then Spaces.
    }
}
