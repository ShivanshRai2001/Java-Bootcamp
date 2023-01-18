import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        armstrong(num1, num2);
    }

    static void armstrong(int num1, int num2) {
        for(int i=num1; i<num2; i++) {
            int check = i;
            int sum = 0;
            while(check!=0) {
                int rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }

            if(sum == i) {
                System.out.println("" + i + " is an Armstrong Number.");
            }
        }
    }
}
