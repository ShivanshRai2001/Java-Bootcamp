public class Practice2 {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        boolean ans = false;

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat.length; j++) {
                int temp = mat[j][i];
                mat[j][i] = mat[i][j];
                mat[i][j] = temp;
            }
        }

        for(int col_1=0, col_2=mat.length-1; col_1<mat.length/2; col_1++,col_2--) {
            for(int row=0; row<mat.length; row++) {
                int temp = mat[row][col_1];
                mat[row][col_1] = mat[row][col_2];
                mat[row][col_2] = temp;;
            }
        }

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat.length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }

        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat.length; j++) {
                if(mat[i][j] == target[i][j]) {
                    ans = true;
                }
            }
        }

        if(ans) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
