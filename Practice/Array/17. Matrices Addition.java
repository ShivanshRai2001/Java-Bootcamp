public class Practice2 {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 1}, {2, 1, 3}, {3, 2, 1}};
        int[][] arr2 = {{2, 1, 2}, {3, 2, 1}, {1, 3, 2}};
        int[][] sum = new int[3][3];

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum is :- ");
        for(int row=0; row<arr1.length; row++) {
            for(int col=0; col<arr2[row].length; col++) {
                System.out.print(sum[row][col] + " ");
            }
            System.out.println();
        }
    }
}
