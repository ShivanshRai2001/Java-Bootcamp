import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        odd_even(num);
    }

    static void odd_even(int num) {
        if(num % 2 == 0) {
            System.out.println("The entered number is even.");
        }
        else {
            System.out.println("The entered number is odd.");
        }
    }
}
