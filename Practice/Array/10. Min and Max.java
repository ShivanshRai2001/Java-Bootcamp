import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {2, 8, 6, 4, 1, 5};
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The max element is : " + max);
        System.out.println("The min element is : " + min);
    }
}
