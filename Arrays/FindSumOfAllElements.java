package Arrays;

public class FindSumOfAllElements {
    public static void main(String[] args) {

        int[] A={1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i = 0; i < A.length; i++) {
            sum=sum+A[i];
        }
        System.out.println("Sum of all the array elements is "+sum);
    }
}
