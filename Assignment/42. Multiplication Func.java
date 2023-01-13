import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        mul(num1, num2);
    }

    static int mul(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println("The multiplication of the number is : " + mul);
        return mul;
    }
}
