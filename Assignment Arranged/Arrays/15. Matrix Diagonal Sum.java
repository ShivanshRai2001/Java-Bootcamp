public class Practice2 {
    public static void main(String[] args) {
        // int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 1}, {2, 3, 4, 5, 6}, {7, 8, 9, 1, 2}, {3, 4, 5, 6, 7}};
        int sum1 = 0;
        int sum2 = 0;
        int rem = 0;
        int total = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if(i == j) {
                    sum1 += matrix[i][j];
                }
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if(i+j == matrix.length-1) {
                    sum2 += matrix[i][j];
                }
            }
        }

        rem = (matrix.length - 1)/2;
        total = sum1 + sum2 - matrix[rem][rem];
        System.out.println(total);
    }
}


 // Short Method
public class Practice2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 1}, {2, 3, 4, 5, 6}, {7, 8, 9, 1, 2}, {3, 4, 5, 6, 7}};
        int sum = 0;
        int rem = 0;
        int total = 0;

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
                
                if(i+j == matrix.length-1) {
                    sum += matrix[i][j];
                }
            }
        }

        rem = (matrix.length - 1)/2;
        total = sum - matrix[rem][rem];
        System.out.println(total);
    }
}
