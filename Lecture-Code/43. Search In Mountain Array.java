public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 10, 9, 5, 1}; // Bitonic array
        int target = 4;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = ans(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return binarySearch(arr, target, peak+1, arr.length - 1);
    }

    static int ans(int[] arr) {
        // first find the range
        // first start with the box of size 2
        int start = 0;
        int end = arr.length -1;

        // condition for the target to lie in the range
        while(start < end) {
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }

            else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }

        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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
