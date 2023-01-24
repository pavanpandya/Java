package Introduction;

public class ExploringJavaProgram {

    public static void main (String[] args){

        System.out.println("Hello World!!");

        // So while executing the program if I write "java Explore string_arg_at_index_0".
        // Now, arg[0] prints "string_arg_at_index_0". --> Command Line Arguments.
        System.out.println(args[0]);

        // If you had written the code but fail to pass the argument then it will show the below error.
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        // at Explore.main(02_Exploring_Java_Program.java:11)
    }
}
