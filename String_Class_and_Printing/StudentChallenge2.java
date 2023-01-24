package String_Class_and_Printing;

public class StudentChallenge2 {
    public static void main(String[] args) {

        // Find if a number is binary or not
        int num1 = 10000110;
        String str1=String.valueOf(num1);
        System.out.println(str1.matches("[01]+"));

        // Find if a number is hexadecimal or not
        String str2="1311A";
        System.out.println(str2.matches("[A-F0-9]+"));

        // Find if the data is in Date format (dd/mm/yyyy)
        String str3 = "13/11/2001";
        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}
