import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the n natural number : ");
        int num = input.nextInt();

        System.out.println("The sum of the number is : " + sum(num));
    }

    static int sum(int num) {
        int sum = 0;
        for(int i=1; i<=num; i++) {
            sum += i;
        }
        return sum;
    }
}
