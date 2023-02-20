import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = new int[6];

        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        System.out.print(Arrays.toString(ans));
    }
}
