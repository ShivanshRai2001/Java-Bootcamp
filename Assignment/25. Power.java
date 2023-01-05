import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num for its power : ");
        int num = input.nextInt();

        System.out.print("Enter the power of the number : ");
        int pow = input.nextInt();

        double res = Math.pow(num, pow);
        System.out.println("The result is : " + res);
    }
}
