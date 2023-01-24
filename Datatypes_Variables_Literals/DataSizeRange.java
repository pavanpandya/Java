// In Java, we first have to declare a variable and then store the data.
// So variables(name given to a data) will have some data type (Type of data that you are going store in that).

// Primitive Data Type:
//  1. Integral -> 1. Byte - ( Size = 1 and Default Value = 0 )
//                 2. Short - ( Size = 2 and Default Value = 0 )
//                 3. Int - ( Size = 4 and Default Value = 0 )
//                 4. Long - ( Size = 8 and Default Value = 0 )

//  2. Floating Point -> 1. Float - ( Size = 4 and Default Value = 0.0f )
//                   and 2. Double - ( Size = 8 and Default Value = 0.0d )

//  3. Char - ( Size = 2 and Default Value = \u0000 )

//  4. Boolean - ( Size = Depends on JVM but min 1 bit and Default Value = False )

package Datatypes_Variables_Literals;

public class DataSizeRange {
    public static void main(String[] args) {
        System.out.println("Int minimum value: " + Integer.MIN_VALUE);
        System.out.println("Int maximum value: " + Integer.MAX_VALUE);
        System.out.println("Int Bytes: " + Integer.BYTES);

        System.out.println("Float minimum value: " + Float.MIN_VALUE);
        System.out.println("Float maximum value: " + Float.MAX_VALUE);
        System.out.println("Float Bytes: " + Float.BYTES);

        System.out.println("Char minimum value: " + Character.MIN_VALUE);
        System.out.println("Char maximum value: " + Character.MAX_VALUE);
        System.out.println("Char Bytes: " + Character.BYTES);
    }
}
