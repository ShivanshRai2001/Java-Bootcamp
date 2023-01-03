import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rem, sum = 0, temp;

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        temp = num;

        while(num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }

        if(temp == sum) {
            System.out.println("The number is a palindrome number.");
        }
        else {
            System.out.println("The number is not palindrome number.");
        }
    }
}
