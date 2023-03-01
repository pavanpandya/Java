package Arrays;

public class FindMaxElement {
    public static void main(String[] args) {

        int A[] = {1, 45, 13, 26, 86, 98, 43, 11, 27, 29};
        int max=A[0];

        for (int x:A) {
            if (x>max){
                max = x;
            }
        }
        System.out.println("Max Element of array A is "+max);

        // Finding the Second-Largest Element.
        int max1=A[0], max2=A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i]>max1){
                max2=max1;
                max1=A[i];
            } else if (A[i]>max2) {
                max2=A[i];
            }
        }
        System.out.println("Second Largest Element of array A is "+max2);
    }
}
