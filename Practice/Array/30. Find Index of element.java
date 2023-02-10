import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 5, 8, 14, 20, 23};
        System.out.println("The array is : " + Arrays.toString(arr));

        System.out.println("Enter the number of find its array : ");
        int num = input.nextInt();

        int index = Arrays.binarySearch(arr, num);

        System.out.println("The index of the number is : " + index);
    }
}


// Using for loop
import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index = 0;
        int[] arr = {1, 5, 8, 14, 20, 23};
        System.out.println("The array is : " + Arrays.toString(arr));

        System.out.println("Enter the number of find its array : ");
        int num = input.nextInt();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == num) {
                index = i;
                break;
            }
        }

        System.out.println("The index of the number is : " + index);
    }
}
