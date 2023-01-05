import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        float amount = input.nextFloat();

        System.out.print("Enter the commission percentage : ");
        float per = input.nextFloat();

        float ans = amount * (per / 100);

        System.out.println("The commission amount is : " + ans);
    }
}
