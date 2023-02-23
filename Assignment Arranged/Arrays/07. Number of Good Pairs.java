public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 3};
        int count = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
