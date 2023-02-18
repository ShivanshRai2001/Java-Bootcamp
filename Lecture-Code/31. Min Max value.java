public class Practice2 {
    public static void main(String[] args) {
        int[] nums = {23, 42, 1, 2, 8, 19, -3, 16, -11, 28};

        min(nums);
    }

    static void min(int[] arr) {
        int min = arr[0];
        int max = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum is : " + max + "\nMinimum is : " + min);
    }
}
