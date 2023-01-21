import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println("The sum of the number is : " + sum(num));
    }

    static int sum(int num) {
        int sum = 0, rem;
        while(num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }
}
