package String_Class_and_Printing;

import java.util.Scanner;

public class StudentChallenge1 {
    public static void main(String[] args) {

        // Find if the email id is from gmail.
        // Find username and domain name from the email.

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Email ID: ");
        String str = s.nextLine();

        if (str.matches("\\w*@gmail.*")){
            int index = str.indexOf("@");
            String username = str.substring(0, index);
            String domain_name = str.substring(index+1);

            System.out.println("Username is "+username);
            System.out.println("Domain Name is "+domain_name);
        }
        else{
            System.out.println("Please Enter Correct Email ID as per constraints!!");
        }
    }
}
