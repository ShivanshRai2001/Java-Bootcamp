import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        int ans = prod(num1, num2) - sum(num1, num2);
        System.out.println("The answer is : " + ans);
    }

    static int prod(int num1, int num2) {
        int prod = 0;
        prod = num1 * num2;
        return prod;
    }

    static int sum(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
}
