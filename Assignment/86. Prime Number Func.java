import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number : ");
        int start_num = input.nextInt();
        System.out.print("Enter the end number : ");
        int end_num = input.nextInt();

        for(int i=start_num; i<=end_num; i++) {
            if(prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean prime(int num) {
        for(int i=2; i<=num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
