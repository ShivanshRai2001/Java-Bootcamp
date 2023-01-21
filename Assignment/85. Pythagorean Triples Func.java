import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = input.nextInt();

        pyth(num1, num2, num3);
    }

    static void pyth(int num1, int num2, int num3) {
        int lhs = (num1 * num1) + (num2 * num2);
        int rhs = num3 * num3;

        if(lhs == rhs) {
            System.out.print("Pythagorean Triples");
        }
        else {
            System.out.println("Not a Pythagorean Triples");
        }
    }
}
