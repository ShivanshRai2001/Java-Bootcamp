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

        int maximum = max(num1, num2, num3);
        System.out.println("The max number is : " + maximum);

        int minimun = min(num1, num2, num3);
        System.out.println("The minimum number is : " + minimun);
    }

    static int max(int num1, int num2, int num3) {
        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max) {
            max = num3;
        }
        return max;
    }

    static int min(int num1, int num2, int num3) {
        int min = num1;
        if(num2 < min) {
            min = num2;
        }
        if(num3 < min) {
            min = num3;
        }
        return min;
    }
}
