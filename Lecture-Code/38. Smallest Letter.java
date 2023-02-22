public class Practice2 {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'c';

        System.out.println(floor(arr, target));
    }

    static char floor(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        // Loop is vilated
        // condition
        // end  target  start
        return arr[start % arr.length];
    }
}
