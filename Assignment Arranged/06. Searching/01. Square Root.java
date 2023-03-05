public class Practice2 {
    public static void main(String[] args) {
        int num = 9;

        System.out.println(sqrt(num));
    }

    static int sqrt(int num) {
        if(num == 0) {
            return 0;
        }

        int first = 1;
        int last = num;

        while(first <= last) {
            int mid = first + (last - first) / 2;
            if(mid == num / mid) {
                return mid;
            }
            else if(mid > num / mid) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return last;
    }
}
