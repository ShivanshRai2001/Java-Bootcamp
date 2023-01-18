import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the count : ");
        int count = input.nextInt();

        fibonacci(count);
    }

    static void fibonacci(int count) {
        int num1 = 0;
        int num3;
        int num2 = 1;
        
        for(int i=0; i<=count; i++) {
            System.out.print(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
