public class Practice2 {
    public static void main(String[] args) {
        int[][] nums = {{23, 42, 1}, {2, 8, 19}, {-3, 16, -11}};

        val(nums);
    }

    static void val(int[][] arr) {
        int min = arr[0][0];
        int max = 0;

        for(int row=0; row<arr.length; row++) {
            for(int col=0; col<arr.length; col++) {
                if(arr[row][col] < min) {
                    min = arr[row][col];
                }

                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        System.out.println("Maximum is : " + max + "\nMinimum is : " + min);
    }
}
