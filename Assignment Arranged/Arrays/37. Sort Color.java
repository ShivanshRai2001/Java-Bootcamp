import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] arr = new int[3];

        for(int i:nums) {
            arr[i]++;
        }
        int i=0;
        while(arr[0]>0) {
            nums[i++] = 0;
            arr[0]--;
        }
        while(arr[1]>0) {
            nums[i++] = 1;
            arr[1]--;
        }
        while(arr[2]>0) {
            nums[i++] = 2;
            arr[2]--;
        }

        System.out.println(Arrays.toString(nums));
    }
}
