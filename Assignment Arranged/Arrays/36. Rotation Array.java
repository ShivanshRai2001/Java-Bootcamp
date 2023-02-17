import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] ans = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            ans[(i+k)%arr.length] = arr[i];
        }
        for(int i=0; i<ans.length; i++) {
            arr[i] = ans[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
