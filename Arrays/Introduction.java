package Arrays;
public class Introduction {
    public static void main(String[] args) {

        // Array is the collection of similar data elements.
        // How array is created?
        // Datatype Name[] = new Datatype[size_of_array];
        // OR
        // Datatype[] Name = new Datatype[size_of_array];
        int A[]=new int[5];
        // Here, A[] is the reference of an array.
        // And, int[5]; is an object.
        // Also, we wrote 'new', so a new object is created inside heap memory.
        // We can access all the location of the array by using their index number and all of them are stored in contagious manner.
        // Total Amount of memory consumed is 5(elements) * 4(Int takes 4 bytes of memory) = 20 bytes.
        // Array has a property or field named "length". So, Along with these 5 elements, It will have one property called "length" of type integer.
        System.out.println(A.length); // It is not a method, so no need of brackets.

        // I want to store 13 at Index 0.
        A[0] = 13;
        System.out.println(A[0]);

        // Depending upon the number of elements we enter, it will decide the size.
        int B[]={1,2,3,4,5};
        System.out.println(B[2]); // Accessing 3rd element.

        // Printing all the elements inside B.
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]+", ");
        }
        System.out.println();
        // For Each Loop
        for (int x:B) {
            // Here, x is taking the values from the B.
            System.out.print(x+", ");
        }
        System.out.println();
        // We can only access elements in forward direction.
        // Important Note: By changing the x, we cannot modify B.

        // Eg:
        for (int x:B){
            System.out.print(x+++", ");
        }
        System.out.println();
        for (int x:B){
            System.out.print(x+", ");
        }
        // You can notice, there is no change in B.
        System.out.println();

        // Important Note: We can modify B by using counter-control loops.

        // Eg:
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i]+++", ");
        }
        System.out.println();
        for (int x:B){
            System.out.print(x+", ");
        }
        // You can notice, there is change in B.
    }
}
