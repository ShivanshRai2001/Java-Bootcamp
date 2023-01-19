import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        fac(num);
    }

    static void fac(int num) {
        for(int i=1; i<=num; i++) {
            if(num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
