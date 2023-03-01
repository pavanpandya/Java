package Arrays;

import java.util.Scanner;

public class InsertingAnElement {
    public static void main(String[] args) {

        int[] A= new int[10];
        A[0]=1;
        A[1]=13;
        A[2]=27;
        A[3]=15;
        A[4]=5;

        for (int x: A) {
            System.out.print(x+", ");
        }
        System.out.println();

        int counter=0;
        for (int x:A) {
            if (x!=0){
                counter++;
            }
        }

        Scanner s=new Scanner(System.in);
        int ind, val;
        System.out.println("Enter the Index Position: ");
        ind=s.nextInt();
        System.out.println("Enter the value you want to insert: ");
        val=s.nextInt();
        for (int i = counter; i > ind; i--) {
            A[i]=A[i-1];
        }
        A[ind]=val;

        for (int x: A) {
            System.out.print(x+", ");
        }
    }
}
