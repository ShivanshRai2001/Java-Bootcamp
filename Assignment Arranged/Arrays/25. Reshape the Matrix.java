public class Practice2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;

        int rows = matrix.length;
        int cols = matrix[0].length;

        if((rows * cols) != (r * c)) {
            for(int i=0; i<matrix.length; i++) {
                for(int j=0; j<matrix.length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        int[][] output = new int[r][c];
        int output_rows = 0;
        int output_cols = 0;


        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                output[output_rows][output_cols] = matrix[i][j];
                output_cols++;

                if(output_cols == c) {
                    output_cols = 0;
                    output_rows++;
                }
            }
        }

        System.out.println("The answer is :- ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
