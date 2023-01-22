import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // array declaration
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter the " + i + " element : ");
            arr[i] = input.nextInt();
        }

        System.out.println("\nThe entered elements are :- ");
        for(int i=0; i<arr.length; i++) {
            System.out.println("The " + i + " element is : " + arr[i]);
        }

        // Enhaced for loop
        System.out.println("");
        for(int num : arr) { // For every element in the array, print the element
            System.out.println("The element is : " + num); // here num represents element of the array
        }

        // Simplest way to print 
        System.out.print(Arrays.toString(arr));
    }
}
