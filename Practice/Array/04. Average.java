public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 3, 4};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        float avg = sum / arr.length;
        System.out.println("The average is : " + avg);
    }
}
