package Arrays;

public class IncreasingSizeOfAnArray {
    public static void main(String[] args) {

        // Once, the array is created, it cannot be increased in size.
        int[] A={1,2,3,4,5};

        // Creating an Array (Doubled the size of A).
        int[] B=new int[2*A.length];

        for (int i = 0; i < A.length; i++) {
            B[i]=A[i];
        }

        // Pointing A to B and Equating B to null.
        A = B;
        B = null;

        System.out.println("Length of an array A is "+A.length);
    }
}
