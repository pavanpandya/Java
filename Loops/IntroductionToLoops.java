package Loops;
public class IntroductionToLoops {
    public static void main(String[] args) {

        // Loops are meant for repeating set of statements.
        // As long as the condition is true, it will be executed repeatedly.
        // Type of Loops:
        // 1. While Loop.
        // 2. Do While Loop.
        // 3. For Loop.
        // 4. For Each Loop.

        // While Loop -- Pre tested Loop.
        // When we are not aware about "how many times we should run/repeat the code" then "While" loop is a better choice.
        // Syntax -
        // while (condition){
            // Code
        // }

        // Example:
        int m=1, n=100;
        while (m<n){
            System.out.println(m);
            m=m*2;
        }

        // Do While Loop -- Post tested Loop.
        // Minimum it will be executed once.
        // Syntax -
        // Do {
            // Code
        // } while (condition);
        // Example:
        int a=1, b=100;
        do {
            System.out.println(a);
            a=a*2;
        } while (a<b);

        // For Loop is a counter controlled loop.
        // When we are aware about "how many times we should run/repeat the code" then "For" loop is a better choice.
        // Syntax:
        // for (initialization; condition; updation) {
             // Code
        // }

        // Example - Print 1 to 10 number.
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }

        // You can also write the above like this: ---> Initialization is optional
        // int i=1;
        // for (;i<=10;i++){
        //    System.out.println(i);
        // }

        // You can also write the above like this: ---> Updation is optional
        // int i=1;
        // for (;i<=10;){
        //    System.out.println(i);
        //    i++;
        // }

        // You can also write the above like this: ---> Infinite Loop
        // int i=1;
        // for (;;){
        //    System.out.println(i);
        //    i++;
        // }

        for (int x=0, y=1; x<=10; x++, y=y*2){
            System.out.println(x+" "+y);
        }
    }
}
