package String_Class_and_Printing;

public class StudentChallenge3 {
    public static void main(String[] args) {

        // Remove Special Characters from the string
        String str1 = "a!b@c#1$2%3";
        str1 = str1.replaceAll("\\W*", "");
        System.out.println("String 1 is "+str1);

        // Remove Extra Spaces from the string
        String str2 = "abc   def   ghi";
        str2 = str2.trim();
        str2 = str2.replaceAll("\\s+", " ");
        System.out.println("String 2 is "+str2);
        // System.out.println(str2.replaceAll("\\s+", " ").trim());

        // Find the number of words in the string
        String str3 = "   aabcc    iih   ";
        str3 = str3.replaceAll("\\s+", " ").trim();
        String words[] = str3.split("\\s");
        int len = words.length;
        System.out.println("String 3 is "+str3);
        System.out.println("Number of words "+len);
    }
}
