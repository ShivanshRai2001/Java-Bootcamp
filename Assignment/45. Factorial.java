import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        int fac = 1;
        int ans = factorial(fac, num);
        System.out.println("The factorial is - " + ans);
    }

    static int factorial(int fac, int num) {
        if(num == 1 || num == 0) {
            System.out.println("1");
        }

        for(int i=1; i<=num; i++) {
            fac = fac * i;
        }
        return fac;
    }
}
