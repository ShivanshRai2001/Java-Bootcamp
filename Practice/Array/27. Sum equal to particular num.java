public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {10, 77, 10, 54, -11, 10};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 10) {
                sum += arr[i];
            }
        }

        if(sum > 30) {
            System.out.println("Sum of 10's is not 30.");
        }
        else {
            System.out.println("Sum of 10's is 30");
        }
    }
}
