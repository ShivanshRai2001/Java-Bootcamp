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


// Long Method
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input number of rows : ");
        int row = input.nextInt();
        System.out.println("Input number of columns of matrix");
        int col  = input.nextInt();
 
        int arr1[][] = new int[row][col];
        int arr2[][] = new int[row][col];
        int sum[][] = new int[row][col];
        
        System.out.println("Input elements of first matrix");
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                arr1[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Input the elements of second matrix");
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                arr2[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum of the matrices:-");
        
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
