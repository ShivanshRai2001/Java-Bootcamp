import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int sum = 0;
        int rem = 0;
        int ans = pali(num, rem, sum);
        // System.out.println(ans);
    }

    static int pali(int num, int rem, int sum) {
        int temp = num;
        while(num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }

        if(temp == sum) {
            System.out.println("The number is Palindrome number.");
        }
        else {
            System.out.println("The number is not palindrome number.");
        }
        return sum;
    }
}
