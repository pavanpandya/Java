package Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        // Syntax for creating two-dimensional array(Collection of arrays)
        int[][] A=new int[3][4];
        // Here, There are 3 rows and 4 columns.

        // Another way of initializing the 2D array
        int[][] B={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        // Printing the array
        for (int i = 0; i < B.length; i++) {
            // Here, B.length gives us the total number of rows present in the array.
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%02d, ", B[i][j]);
            }
            System.out.println();
        }

        System.out.println("Printing Using ForEach Loop");

        // Printing the array - Using foreach loop
        for (int x[]: B) {
            // Here, x[] will take the reference of each row one-by-one.
            for (int y:x) {
                // y will take each element from the x.
                System.out.printf("%02d, ",y);
            }
            System.out.println();
        }

        // Jagged Array
        // int[] C; means it will create an array reference. But, int[][] C is reference to array of reference and hence, we write two brackets.
        int[][] C; // This will create C;
        C=new int[3][]; // This will create an array of size 3 of references.
        C[0]=new int[2];
        C[1]=new int[3];
        C[2]=new int[4];
    }
}
