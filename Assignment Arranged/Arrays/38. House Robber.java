public class Practice2 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            if(i%2 == 0) {
                sum += nums[i];
            }
        }

        System.out.println(sum);
    }
}
