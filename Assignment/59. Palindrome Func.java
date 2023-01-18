import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if(num == palidrome(num)) {
            System.out.println("The number is palidrome.");
        }
        else {
            System.out.println("The number is not palidrome.");
        }
    }

    static int palidrome(int num) {
        int rem, sum = 0;

        while(num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }

        return sum;
    }
}
