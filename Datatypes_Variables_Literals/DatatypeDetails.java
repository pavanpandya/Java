package Datatypes_Variables_Literals;

public class DatatypeDetails {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(Integer.toBinaryString(x));

        int y = -5;
        System.out.println(Integer.toBinaryString(y));
    }
}

// Representation of byte memory:

// How -5 is stored in the memory?
// They are stored in 2's complement form.
// Step - 1: Represent 5 in binary form =         00000101.
// Step - 2: Now, We take 1's complement =        11111010 -> How to take 1's complement -> Just Inverse the digits.
// Step - 3: Now, add 1 in the 1's complement =  +       1
//                                              -------------
// Step - 4: Final conversion - 2's complement =  11111011 -> Here, 1st value is considered as sign bit.
// 0 means +ve number and 1 means -ve number.