import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(sum(arr, target)));
    }

    static int[] sum(int[] arr, int target) {
        int start = 0;
        int last = arr.length-1;

        for(int i=0; i<arr.length-1; i++) {
            int sum = arr[start] + arr[last];

            if(sum == target) {
                return new int[]{start+1, last+1};
            }
            else if(sum > target) {
                last--;
            }
            else {
                start++;
            }
        }

        return new int[0];
    }
}
