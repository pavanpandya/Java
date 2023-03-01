package Arrays;

import java.util.Scanner;

public class SearchAnElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int key;
        System.out.println("Enter a key: ");
        key=s.nextInt();
        int[] A={1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < A.length; i++) {
            if (A[i]==key){
                System.out.println("Element "+key+" is found at index position "+i);
                System.exit(0); // It will stop the execution of program.
            }
        }
        System.out.println("Element Not Found");
    }
}
