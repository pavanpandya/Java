// Variable to type object, we call them as reference.
package String_Class_and_Printing;

public class StringAndStringMethods {
    public static void main(String[] args) {

        // String is the build-in class in JAVA, but it is almost used as a data type.
        // String is a collection of Characters that are forming words or sentences or names or anything.

        // Simplest Method of creating a String
        String str1 = "Java Program"; // This has to be enclosed in double quotes.
        // Here, str1 is the variable (we can it as reference) and "Java Program" is the String Object and also a String Literal.
        System.out.println(str1);

        // Reference means what?
        // It will the hold the object, or it is having the address of that object. But, In Java we don't talk in terms of addresses or pointers, we call it as reference.

        // Constructors - They are the Functions/Methods that are used for creating objects.
        // Example: 1. .String(char[])
        //          2. .String(byte[])
        //          2. .String(String)
        // Use Command "javap java.lang.String" to find more methods.

        char c[] = {'A', 'B', 'C', 'D'};
        // Components: 1. 'String' is class name.
        //             2. 'str2' is a reference (hold/point the object).
        //             3. 'new' means Object will be created in Heap.
        //             4. 'String(c)' is a constructor.
        // Constructor is a method and will have same name as class name
        // So, now the array content in 'c' will get converted in the form of string.
        String str2 = new String(c);
        System.out.println(str2);

        byte b[] = {65, 66, 67, 68};
        String str3 = new String(b); // Here, Constructor is 'String(b)'
        System.out.println(str3);

        String str4 = new String("Java");
        // Interesting Facts:
        // When we create a new string using the above method we are also giving a string literal.
        // How the object is created?
        // Two Objects will be created: 1. In the Heap Memory ( Because we wrote "new String("Java")" )
        //                              2. In the String Pool. ( Because we are specifying a literal, It was also occupy some space.)

        String str5 = "Java";
        // str5 will point to "Java" object, and It Will be stored in String Pool.

        // Important Note - Literals also occupy space.

        // -------------------------------------------------------------------------------------------------------------

        String str6 = "Pavan";
        String str7 = "Pavan";

        // When we are using same literal, Java will not create another object.
        // Therefore, both str6 and str7 points to the same object "Pavan" stored in String Pool.
        // But if we write,

        String str8 =  new String("Pavan");
        // Here, we are writing "new" (meaning new object will be created in the heap) and str8 will be pointing to that object.
        // But, it will not create a new object in the string pool as "Pavan" is already present in String Pool. Thus, st8 will be point to that same object.
    }
}

