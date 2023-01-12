import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = input.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }

        int c = 2;
        while(c*c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }

        if(c * c > n) {
            return true;
        }

        return false;
    }
}
