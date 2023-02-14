public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // int[] arr = {1, 1, 2};
        int count = 1;

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
