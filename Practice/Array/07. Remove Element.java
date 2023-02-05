import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 8, 9, 0, 5, 4, 6};

        System.out.println("Original array is : " + Arrays.toString(arr));
        
        System.out.print("Enter the character to remove : ");
        int index = input.nextInt();

        for(int i=index; i<arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }

        System.out.println("Final Array is : " + Arrays.toString(arr));
    }
}
