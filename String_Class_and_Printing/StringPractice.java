package String_Class_and_Printing;

public class StringPractice {
    public static void main(String[] args) {

        String str1 = "Java";
        System.out.println(str1);

        String str2 = new String("Java Program");
        System.out.println(str2);

        char c[] = {'A', 'B', 'C', 'D'};
        String str3 = new String(c);
        System.out.println(str3);

        // Now, there's another method 'String(char, int, int)'. Where, First 'int' represents starting index and Second 'int' represents number of characters.
        String str4 = new String(c, 1, 3);
        System.out.println(str4);

        String str5 = "Pavan";
        String str6 = "Pavan";

        // For checking whether str5 and str6 are same string or not -- We will compare their references.
        System.out.println(str5==str6);

        // "==" gives result as True if they are holding same reference else it returns false.

        String str7 = new String("Pavan");
        // As, we have written 'new', It will create a new object. Thus, it should give result as false.
        System.out.println(str5==str7);
    }
}
