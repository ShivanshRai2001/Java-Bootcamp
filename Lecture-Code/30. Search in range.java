public class Practice2 {
    public static void main(String[] args) {
        int[] nums = {23, 42, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;

        System.out.println(search(nums, target, 2, 6));
    }

    static int search(int[] arr, int tagert, int start, int end) {
        for(int i=start; i<=end; i++) {
            if(arr[i] == tagert) {
                return i;
            }
        }

        return 999;
    }
}
