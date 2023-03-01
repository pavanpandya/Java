package Arrays;

public class MutliplyingTwoMatrices {
    public static void main(String[] args) {

        int[][] A={{3,5,9}, {7,6,2}, {4,3,5}}; // 3X3
        int[][] B={{1,5,2}, {6,8,4}, {3,9,7}}; // 3X3

        // To Perform Multiplication, Number of columns of first matrix and number of rows of second matrix must be same.
        // Performing Operation on A and B and stored the resulting in matrix C.
        int[][] C=new int[3][3];

        if (A[0].length == B.length){
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    
                }
            }
        }else {
            System.out.println("Multiplication can't be performed because of incompatibility with the dimensions of the matrix.");
        }
    }
}
