import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println("The factorial is : " + fact(num));
    }

    static int fact(int num) {
        int fac = 1;
        int count = num;
        for(int i=1; i<=count; i++) {
            fac *= i;
        }
        return fac;
    }
}
