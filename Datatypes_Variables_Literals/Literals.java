// Literals are the constant values used in the program.

// datatype  variable
// int       num; Here "num" stores the value that is of "integer" datatype.
// num = 5; Here, "5" is the "integer literal".

// double price = 311.5; Here, "311.5" is the "double literal".
// Any value with decimal is by default a double literal.
// Any value without decimal is by default a int literal.
// char c='A'; 'A' is a character literal. (Single Quote)
// String str = "Java"; Here, 'Java' object is a string literal. (Double Quote)

package Datatypes_Variables_Literals;

public class Literals {
    public static void main(String[] args) {
        System.out.println("Literals");

        byte b1=10; // Decimal - 10 digits (0 to 9)
        byte b2=0b1010; // Binary - 2 digits (0, 1)
        byte b3=012; // Octal - 8 digits (0 to 7)
        byte b4=0XA; // Hexadecimal - 16 digits (0 to 9, A to F)

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}

// Literals
// No.    Datatype         Literal           Examples
// 1.     byte             int               byte b=13;
// 2.     short            int               short s=13;
// 3.     int              int               int i=13;
// 4.     long             L or l            long a=5l; or long a=5L;
// 5.     float            F or f            float c=2.5F; or float c=2.5f; -> If you don't write F or f, then, by-default it is double literal.
// 6.     double           D or d            double x=2.5; or double x=2.5D; or double x=2.5d;
// 7.     char             ''                char ch='A';
// 8.     boolean          true/false