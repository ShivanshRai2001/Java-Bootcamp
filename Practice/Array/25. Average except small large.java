public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9};

        int large = arr[0];
        int small = arr[0];
        float sum = 0;

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(arr[i] > large) {
                large = arr[i];
            }
            else if(arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println(sum);
        float ans = ((sum - large - small) / (arr.length - 2));
        System.out.println("Average without small and largest number : " + ans);
    }
}
