import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[3][2];

        // Input
        for(int row=0; row<arr.length; row++) {
            // for each col in every row
            for(int col=0; col<arr[row].length; col++) {
                System.out.print("Enter the [" + row + "][" + col + "] element : ");
                arr[row][col] = input.nextInt();
            }
        }

        // Output
        System.out.println("\nEntered elements are :- ");
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                System.out.println("Element at [" + row + "][" + col + "] is : " + arr[row][col]);
            }
        }

        // In matrix format
        System.out.println("In matrix form :- ");
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // Simplest form
        for(int row=0; row<arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        // or
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
