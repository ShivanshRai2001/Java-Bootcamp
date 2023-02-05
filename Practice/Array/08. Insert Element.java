import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 3, 4, 7, 5, 6, 9};

        System.out.println("Origianl aaray : " + Arrays.toString(arr));

        System.out.print("Enter the element to entered : ");
        int num = sc.nextInt();

        System.out.print("Enter the index of that element : ");
        int index = sc.nextInt();

        for(int i=arr.length - 1; i>index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = num;

        System.out.println("New array : " + Arrays.toString(arr));
    }
}
