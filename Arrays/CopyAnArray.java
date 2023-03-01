package Arrays;

public class CopyAnArray {
    public static void main(String[] args) {

        int[] A={1,2,3,4,5,6,7,8,9,10};
        int[] B=new int[10];
        int[] C=new int[10];

        // Copying an array
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }

        // Printing an Array
        for (int x: B) {
            System.out.print(x+", ");
        }

        System.out.println();

        // Reverse Copying an Array
        for (int j = (A.length-1), k=0; j >= 0; j--, k++) {
            C[k] = A[j];
        }

        // Printing an Array
        for (int y: C) {
            System.out.print(y+", ");
        }
    }
}
