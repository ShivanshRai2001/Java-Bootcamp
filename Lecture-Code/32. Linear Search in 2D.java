import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[][] nums = {{23, 42, 1}, {2, 8, 19}, {-3, 16, -11}};
        int target = -3;

        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr.length; col++) {
                if(arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
