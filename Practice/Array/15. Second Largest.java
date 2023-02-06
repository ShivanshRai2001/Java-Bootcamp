import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 6, 8};

        System.out.println("Original Array : " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("The second largest number is : " + Arrays.toString(arr));

        for(int i=0; i<arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        System.out.println("The reverse array is : " + Arrays.toString(arr));
        System.out.println("The second largest element is : " + arr[1]);
    }
}


// Simple way
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 6, 8};

        System.out.println("Original Array : " + Arrays.toString(arr));

        Arrays.sort(arr);

        int index = arr.length - 1;

        while(arr[index] == arr[arr.length - 1]) {
            index--; 
        }
        System.out.println("Second largest value: " + arr[index]);
    }
}
