public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 0; // ans may show out of bound since it is a infinite array
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // first find the range
        // first start with the box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2; // better way of doing this as it does not exceds the limit

            if(target < arr[mid]) { // For decending order the operation will change to >
                end = mid - 1;
            }

            else if(target > arr[mid]) { // For decending order the operation will change to <
                start = mid + 1;
            }

            else {
                return mid;
            }
        }

        return -1;
    }
}
