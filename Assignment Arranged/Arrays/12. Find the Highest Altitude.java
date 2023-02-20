public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {-4, -3, -2, -1, 4, 3, 2};
        int high = 0;
        int point = 0;

        for(int i=0; i<arr.length; i++) {
            point += arr[i];
            high = Math.max(high, point);
        }

        System.out.println(high);
    }
}
