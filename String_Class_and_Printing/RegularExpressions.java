package String_Class_and_Printing;

public class RegularExpressions {
    public static void main(String[] args) {

        // Match Symbols:

        // Regular Expression           Description
        // .                            Any Single Character
        // [abc]                        Exactly Given Letters (eg: Only True if it 'a' or 'b' or 'c')
        // [abc][vz]                    First Alphabet must be among a or b or c and Second Alphabet must be among v or z.
        // [^abc]                       Except a or b or c.
        // [a-z0-9]                     Single Alphabet must be from a to z or 0 to 9.
        // A|B                          Single Alphabet can be either A or B.
        // XA                           Two Alphabet must be Exactly XA --> True else False.

        String str = "p";
        System.out.println(str.matches(".")); // True

        String str1 = "1";
        System.out.println(str1.matches(".")); // True

        str1 = "abc";
        System.out.println(str1.matches(".")); // False - Because "." means any single character
        System.out.println(str1.matches("abc")); // Returns True if it is an exact match.

        System.out.println(str.matches("[pabc]")); // Returns True if Single character is among p or a or b or c.

        System.out.println(str.matches("[^pabc]")); // Returns True if Single character is not among p or a or b or c.

        System.out.println(str.matches("[a-z0-9]")); // Returns True if Single character is from a to z or 0 to 9.

        String str2 = "1p";
        System.out.println(str2.matches("[0-9][a-z]")); // Returns True if first character is from 0 to 9 and second character is from a to z.

        // Meta Character -- (For Single Alphabet)

        // Regular Expression           Description
        // \d                           Digits
        // \D                           Not Digits
        // \s                           Space
        // \S                           Not Space
        // \w                           Alphabet or Digit
        // \W                           Neither Alphabet nor Digit

        System.out.println(str.matches("\\w"));

        // Quantifiers -- Used for specifying how many symbols we want.

        // Regular Expression           Description
        // *                            0 or more time.
        // +                            1 or more time.
        // ?                            0 or 1 time.
        // {x}                          X times.
        // {x, Y}                       Between X and Y time.

        String str3 = "abcdef";
        System.out.println(str3.matches(".*"));
        System.out.println(str3.matches("[a-z]*"));

        System.out.println("abc 34".matches("[a-z]*"));
        System.out.println("abcbacacbbbacacacbbbaca".matches("[abc]*"));
        System.out.println("".matches("[abc]*"));
        System.out.println("".matches("[abc]+"));

        System.out.println("cab".matches("[abc]{3}")); // It should be from a or b or c and there must be exactly three letters.
        System.out.println("aaa".matches("[abc]{3}")); // It should be from a or b or c and there must be exactly three letters.

        System.out.println("aaabbb".matches("[abc]{3,7}")); // It should be from a or b or c and there must be at least three letters and maximum 7 letters.

        // Expression to check if the email id is from gmail
        String email = "pavanpandya1311@gmail.com";
        System.out.println(email.matches(".*@gmail.*")); // Means before and after 'gmail' there can be any character/s.
        System.out.println(email.matches(".\\w*@gmail.*")); // Means before 'gmail' there can be any alphabets or digits and after 'gmail' there can be any character/s.
    }
}
