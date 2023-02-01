import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 3};

        System.out.println("Original String : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted String : " + Arrays.toString(arr));
    }
}
