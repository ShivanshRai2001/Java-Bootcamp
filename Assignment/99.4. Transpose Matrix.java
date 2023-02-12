public class Practice2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] ans = new int[matrix.length][matrix.length];

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        System.out.println("After tranpose :- ");
        for(int i=0; i<ans.length; i++) {
            for(int j=0; j<ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
