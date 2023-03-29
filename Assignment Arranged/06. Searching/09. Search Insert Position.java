public class Practice2 {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 6};
        int target = 2;

        System.out.println(index(num, target));
    }

    static int index(int[] num, int target) {
        int start = 0;
        int end = num.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(num[mid] == target) {
                return mid;
            }
            else if(target > num[mid]) {
                start = mid + 1;
            }
            else if(target < num[mid]) {
                end = mid - 1;
            }
        }
        return start;
    }
}
