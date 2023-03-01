package Arrays;

public class RotatingTheArray {
    public static void main(String[] args) {

        System.out.println("Performing Left Rotation");

        int[] A={1, 57, 13, 48, 63, 89, 21, 76};
        int temp = A[0];

        System.out.println("Before Change: ");
        for (int x:A) {
            System.out.print(x+", ");
        }

        // Left Rotation
        for (int i = 1; i < A.length; i++) {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;

        System.out.println();
        System.out.println("After Change: ");
        for (int x:A) {
            System.out.print(x+", ");
        }
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("Performing Right Rotation");

        int[] B={1, 57, 13, 48, 63, 89, 21, 76};
        int t=B[(B.length)-1];

        System.out.println("Before Change: ");
        for (int x:B) {
            System.out.print(x+", ");
        }

        // Right Rotation
        for (int j = (B.length)-1; j > 0; j--) {
            B[j]=B[j-1];
        }
        B[0]=t;

        System.out.println();
        System.out.println("After Change: ");
        for (int x:B) {
            System.out.print(x+", ");
        }
    }
}
