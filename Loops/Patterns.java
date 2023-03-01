package Loops;
public class Patterns {
    public static void main(String[] args) {

        // Pattern - 1
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Output - 1
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5
//        1 2 3 4 5

        System.out.println();

        // Pattern - 2
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // Output - 2
//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5

        System.out.println();

        // Pattern - 3
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%02d ", (i+j));
            }
            System.out.println();
        }

        // Output - 3
//        02 03 04 05 06
//        03 04 05 06 07
//        04 05 06 07 08
//        05 06 07 08 09
//        06 07 08 09 10

        System.out.println();

        // Pattern - 4
        int count=0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                ++count;
                // System.out.print(count+" ");
                System.out.printf("%02d ", count);
            }
            System.out.println();
        }

        // Output - 4
//        01 02 03 04 05
//        06 07 08 09 10
//        11 12 13 14 15
//        16 17 18 19 20
//        21 22 23 24 25

        System.out.println();

        // Pattern - 5
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Output - 5
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

        System.out.println();

        // Pattern - 6
        int count1=0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", ++count1);
            }
            System.out.println();
        }

        // Output - 6
//        01
//        02 03
//        04 05 06
//        07 08 09 10
//        11 12 13 14 15

        System.out.println();

        // Pattern - 7
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5-i+1); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // Output - 7
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

        System.out.println();

        // Pattern - 8
        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= (5-i+1); j++) {
//                System.out.print("* ");
//            }
            // Better Code
            for (int j = 1; j <= 5; j++) {
                if (i<=j){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Output - 8
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *

        System.out.println();

        // Pattern - 9
        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= (5-i+1); j++) {
//                System.out.print("* ");
//            }
            // Better Code
            for (int j = 1; j <= 5; j++) {
                if (i<=j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Output - 9
//        * * * * *
//          * * * *
//            * * *
//              * *
//                *

        System.out.println();

        // Pattern - 10
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= 5; j++) {
                if (i>j){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        // Output - 10
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *

        System.out.println();
    }
}
