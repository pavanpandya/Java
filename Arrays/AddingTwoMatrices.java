package Arrays;

public class AddingTwoMatrices {
    public static void main(String[] args) {

        int[][] A={{3,5,9}, {7,6,2}, {4,3,5}};
        int[][] B={{1,5,2}, {6,8,4}, {3,9,7}};

        // If Both are the matrices are of same order then and then only they can be added or subtracted.
        // Performing Operation on A and B and stored the resulting in matrix C.
        int[][] C=new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j]=A[i][j]+B[i][j];
            }
        }

        for (int x[]:C) {
            for (int y:x) {
                System.out.printf("%02d ", y);
            }
            System.out.println();
        }
    }
}
