import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        System.out.print("Enter the power : ");
        int pow = input.nextInt();

        System.out.println("The " + num + " to the power " + pow + " is : " + power(num, pow));
    }

    static double power(int num, int pow) {
        double ans = Math.pow(num, pow);
        return ans;
    }
}
