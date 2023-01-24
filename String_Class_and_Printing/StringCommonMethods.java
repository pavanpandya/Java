package String_Class_and_Printing;

public class StringCommonMethods {
    public static void main(String[] args) {

        // This object will be created in the String Pool.
        String str = "Java";

        // By using the "." operator we can call the method of the class.
        int str_length = str.length();
        System.out.println("Length of the String "+str+" is "+str_length);

        // Important Pointers:
        // ".toUpperCase()" or such methods won't change the String Object.
        // Why?
        // Because String Objects are immutable (They cannot be modified).
        // Then, How will perform the operation? eg: .toUpperCase()
        // It will take the String. Creates a new String (its object will be stored in Heap Memory) --> performs the operation. And returns the new string.
        // We can take that result and can store it in some other string reference.

        String str1 = str.toUpperCase(); // Change everything into uppercase.
        System.out.println(str1);

        // If we write like this --> str = str.toUpperCase();. Then, new object will be given to "str", and it will point to the new object.
        // And this new object will be created in Heap Memory.

        String str2 = str.toLowerCase(); // Change everything into lowercase.
        System.out.println(str2);

        String str3 = "    Hello World    "; // There are some leading and trailing blank spaces in str3.
        str3 = str3.trim(); // Removes the blank spaces.
        System.out.println(str3);

        String sub = str3.substring(6); // Returns substring starting from index 6 till end of the string.
        System.out.println(sub);

        String sub1 = str3.substring(6, 9); // Returns substring starting from index 6 to index 9 (excluding 9).
        System.out.println(sub1);

        String rep = str.replace('J', 'P'); // All 'J' will be replaced with 'P'.
        System.out.println(rep);

        String url = "www.pavanpandya.com";
        Boolean begins_with = url.startsWith("www"); // Returns True or False.
        System.out.println(begins_with);

        Boolean ends_with = url.endsWith("com"); // Returns True or False.
        System.out.println(ends_with);

        System.out.println(url.contains("pavanpandya")); // returns true if this string contains 's', false otherwise.

        // str = "Java"
        //        0123 --> Index Position
        char char_index = str.charAt(0);
        System.out.println(char_index);

        int i = url.indexOf("."); // Returns starting index (if found) else return -1.
        System.out.println(i);

        i = url.indexOf(".", 4); // We can also mention some starting point for searching particular substring.
        System.out.println(i);

        int l = url.lastIndexOf("."); // Starts searching from the right to left.
        System.out.println(l);

        l = url.lastIndexOf(".", 14); // Starts searching from index 14. (Right to Left)
        System.out.println(l);

        String lang1 = "Python";
        String lang2 = "Python";
        String lang3 = "PYTHON";

        boolean check = lang1.equals(lang2);
        System.out.println(check);

        boolean check2 = lang1.equals(lang3);
        System.out.println(check2);

        check2 = lang1.equalsIgnoreCase(lang3);
        System.out.println(check2);

        // ".compareTo()" - Compare two strings in dictionary order.
        int check3 = "Java".compareTo("Python"); // Here, 'J' comes first than 'P'. Therefore, first string comes first than the second string.
        // Thus, gives result as '-ve integer'.
        System.out.println(check3);

        check3 = "Python".compareTo("Java"); // Here, 'J' comes first than 'P'. Therefore, second string comes first than the first string.
        // Thus, gives result as '+ve integer'.
        System.out.println(check3);

        check3 = "Python".compareTo("Python"); // Here, both the string are equal.
        // Thus, gives result as '0'.
        System.out.println(check3);

        // Pointers = 1. '-ve integer' --> If first string is smaller.
        //            2. '0' --> If both the string are equal.
        //            3. '+ve integer' --> If first string is larger.

        int check4 = "PYTHON".compareTo("Python"); // Here, It will compare the ASCII Code.
        // Thus, gives result as '-ve integer'.
        System.out.println(check4);

        String str4 = "java";
        String str5 = "java";
        String str6 = new String("java");

        System.out.println(str4==str5); // Compares Reference
        System.out.println(str4.equals(str5)); // Compares Value

        System.out.println(str4==str6); // Compare Reference
        System.out.println(str4.equals(str6)); // Compares Value
    }
}
