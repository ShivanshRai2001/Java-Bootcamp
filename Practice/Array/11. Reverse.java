import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 6, 4};

        System.out.println("Original Array : " + Arrays.toString(arr));

        for(int i=0; i<arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("The reverse array is : " + Arrays.toString(arr));
    }
}
