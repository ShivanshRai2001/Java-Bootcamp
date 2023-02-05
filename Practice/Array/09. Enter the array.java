import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter the array :- ");
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter the " + i + " elements : ");
            arr[i] = input.nextInt();
        }
        System.out.println("Arrays : " + Arrays.toString(arr));
    }
}
