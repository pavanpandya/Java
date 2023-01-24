// Java provides the class called "scanner" that is used for reading the data from different sources.
// This class is present inside "util" package.
package Introduction;

import java.util.Scanner;

public class ReadFromKeyboard {
    public static void main(String[] args) {
        System.out.println("Understand the concept of reading the inputs from the Keyboard");
        // Class name   Reference           Constructor
        Scanner      s          =    new Scanner(System.in); // "System in" object is associated with the keyboard.

        String name;
        int a,b,c;

        System.out.println("Enter your Name:");
        name = s.nextLine();

        System.out.println("Welcome " + name);
        System.out.println("Enter Two Numbers:");

        a = s.nextInt();
        b = s.nextInt();
        c = a + b;

        System.out.println("Sum is: " + c);
    }
}

// Various Methods:
// 1. For Reading Integer -> nextInt()
// 2. For Reading Float -> nextFloat()
// 3. For Reading Double -> nextDouble()
// 4. For Reading String -> next() --> Read one words
// 5. For Reading Sentence or a line -> nextLine() --> Read Multiple words
// 6. Few More Methods -> nextByte(), nextShort(), nextLong(), nextBoolean()
// 7. Before reading, if you want to check if it's an int or not -> hasNextInt() -> Return True or False
// 8. Before reading, if you want to check if it's a Float or not -> hasNextFloat() -> Return True or False
// 9. For Reading Binary Number -> useRadix(2)

// You can use "javap" command to check the all the methods available in that class
// eg: javap java.util.Scanner
