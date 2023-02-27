// To know the arr in which order
public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr1 = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        int target = 22;
        System.out.println(binarySearch(arr, target));
        System.out.println(binarySearch(arr1, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2; // better way of doing this as it does not exceds the limit
            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(target < arr[mid]) { 
                    end = mid - 1;
                }
    
                else if(target > arr[mid]) { 
                    start = mid + 1;
                }
            }
            else {
                if(target > arr[mid]) { 
                    end = mid - 1;
                }
    
                else if(target < arr[mid]) { 
                    start = mid + 1;
                }
            }
            
        }

        return -1;
    }
}
