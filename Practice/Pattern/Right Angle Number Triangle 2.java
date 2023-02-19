/*  1
    22
    333
    4444
    55555
    666666
    7777777
    88888888
    999999999
    10101010101010101010 */

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
