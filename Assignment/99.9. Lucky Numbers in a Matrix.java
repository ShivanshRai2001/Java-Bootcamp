import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
        List<Integer> list = new ArrayList<Integer>();
        int rows[] = new int[matrix.length];
        int columns[] = new int[matrix[0].length];

        for(int i=0; i<matrix.length; i++) {
            int min = 999999999;
            for(int j=0; j<matrix[i].length; j++) {
                min = Math.min(matrix[i][j], min);
            }
            rows[i] = min;
        }

        for(int i=0; i<matrix[0].length; i++) {
            int max = 0;
            for(int j=0; j<matrix.length; j++) {
                max = Math.max(matrix[j][i], max);
            }
            columns[i] = max;
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(rows[i] == columns[j]) {
                    list.add(rows[i]);
                }
            }
        }

        System.out.println(list);
    }
}
