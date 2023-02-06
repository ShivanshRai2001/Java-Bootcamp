import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 6, 8, 3};

        System.out.println("Original Array : " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("The second smallest element is : " + arr[1]);
    }
}
