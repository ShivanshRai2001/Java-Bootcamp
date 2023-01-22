public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max_value = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max_value < arr[i]) {
                max_value = arr[i];
            }
        }
        return max_value;
    }
}
