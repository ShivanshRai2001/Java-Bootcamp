import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        large(num1, num2);
    }

    static void large(int num1, int num2) {
        if(num1 > num2) {
            System.out.println(num1 + " is largest.");
        }
        else {
            System.out.println(num2 + " is laegest.");
        }
    }
}
