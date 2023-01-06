// Sum Of N Numbers

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the natural number : ");
        int ele = input.nextInt();

        int sum = 0;

        for(int i=1; i<=ele; i++) {
            System.out.print("Enter the " + i + " numbers : ");
            int num = input.nextInt();

            sum += num;
        }
        System.out.println("The sum of the number is : " + sum);
    }
}


// Take integer inputs till the user enters 0 and print the sum of all numbers 

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.print("Enter the number : ");
            int num = input.nextInt();

            if(num == 0) {
                break;
            }
            else {
                sum += num;
            }
            System.out.println(sum);
        }
        // System.out.println(sum);
    }
}
