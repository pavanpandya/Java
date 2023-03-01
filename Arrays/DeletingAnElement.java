package Arrays;

import java.util.Scanner;

public class DeletingAnElement {
    public static void main(String[] args) {

        int[] A = new int[10];
        A[0]=1;
        A[1]=13;
        A[2]=27;
        A[3]=15;
        A[4]=5;
        A[5]=13;

        for (int x: A) {
            System.out.print(x+", ");
        }
        System.out.println();

        Scanner s=new Scanner(System.in);
        int ind;
        System.out.println("Enter the Index Position: ");
        ind=s.nextInt();
        for (int i = ind+1; i < A.length; i++) {
            A[i-1]=A[i];
        }

        for (int x: A) {
            System.out.print(x+", ");
        }
    }
}
