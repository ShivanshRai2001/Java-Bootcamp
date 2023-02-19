/*  1
    12
    123
    1234
    12345
    123456
    1234567
    12345678
    123456789
    12345678910 */

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
