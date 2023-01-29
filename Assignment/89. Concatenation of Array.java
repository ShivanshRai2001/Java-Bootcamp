import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        int n = arr.length;
        int[] ans = new int[2*n];

        for(int i=0; i<n; i++) {
            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
