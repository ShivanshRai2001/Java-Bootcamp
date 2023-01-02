import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number for fibonacci series : ");
        int count = input.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num3;

        for(int i=2; i<=count; ++i) {
            System.out.println(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
