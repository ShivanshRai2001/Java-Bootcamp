public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 6, 4, 3, 1};
        int large = 0;
        int small = arr[0];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > large) {
                large = arr[i];
            }
        }

        for(int j=0; j<arr.length; j++) {
            if(arr[j] < small) {
                small = arr[j];
            }
        }

        System.out.println("The difference of largest and smallest is : " + (large - small));
    }
}
