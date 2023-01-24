// lang is package.
// It is mandatory package. Even if you don't import it, it gets imported automatically.
package Introduction;

public class First {
    // Here, we have "main" method. Just like in C++, we have "main" function.
    // It's return type is "void".
    // If you want anything from the class to be accessible outside, then it must be "public".
    // Why? Because, when we write java First, JVM will call main method and thus, it should be public so that it can access it.
    // If you want to use anything from the class without creating an object, then that should be declared as "static".
    // So, if it is static, it can directly be called without creating an object of the class, just by using the class name.
    // Thus, JVM will use "First.main()" to call the method without creating an object.
    // "String arg[]" is command line arguments - it is optional, but you should always write it regardless of whether you are using it or else it will compile but won't run.
    public static void main (String[] args){
        // println is the method
        // System is the class, out is an object and println is the method inside them.
        System.out.println("Hello World!!");
    }
}
