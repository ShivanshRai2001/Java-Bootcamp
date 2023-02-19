/*  1 
    2 3
    4 5 6
    7 8 9 10 */

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int k=1;

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
