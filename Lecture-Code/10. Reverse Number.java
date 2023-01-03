import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to be counter occurance : ");
        int num = input.nextInt();

        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem;
        }

        System.out.println("The reverse of the number is : " + ans);
    }
}
