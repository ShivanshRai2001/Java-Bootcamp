/*      1 
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5 */

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int s = num+4-1;

        for(int i=1; i<=num; i++) {
            for(int x=s; x!=0; x--) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }
    }
}
