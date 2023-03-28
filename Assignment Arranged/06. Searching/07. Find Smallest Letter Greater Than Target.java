public class Practice2 {
    public static void main(String[] args) {
        char[] arr = {'c', 'd', 'e', 'z'};
        char target = 'c';

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        System.out.println(arr[start%arr.length]);
    }
}
