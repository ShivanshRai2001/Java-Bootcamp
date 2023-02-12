import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the row : ");
        int r = input.nextInt();
        System.out.print("Enter the column : ");
        int c = input.nextInt();

        int[][] arr = new int[r][c];
        int[][] indices = {{0, 1}, {1, 1}};
        // int[][] indices = {{1, 1}, {0, 0}};

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                arr[i][j] = 0;
            }
        }
        
        for(int i=0; i<indices.length; i++) {
            int r_inc = indices[i][0];
            int c_inc = indices[i][1];

            for(int j=0; j<c; j++) {
                arr[r_inc][j]++;
            }

            for(int k=0; k<r; k++) {
                arr[k][c_inc]++;
            }
        }

        int count = 0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(arr[i][j]%2!=0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
