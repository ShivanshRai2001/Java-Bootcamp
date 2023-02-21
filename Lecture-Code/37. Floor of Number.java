public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        // int[] arr = {-18, -12, -4, 0, 2, 3, 4, 16, 18, 22, 45, 89};
        int target = 4;

        System.out.println(floor(arr, target));
    }

    // Greatest number smaller than or equal to the target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }

            else if(target > arr[mid]) {
                start = mid + 1;
            }

            else {
                return mid;
            }
        }

        // Loop is vilated
        // condition
        // end  target  start
        return arr[end];
    }
}
