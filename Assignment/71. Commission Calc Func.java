import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount : ");
        float amt = input.nextInt();
        System.out.print("Enter the commision percentage : ");
        float per = input.nextInt();

        System.out.println("The comission amount is : " + comm(amt, per));
    }

    static float comm(float amt, float per) {
        float commision = amt * (per / 100);
        return commision;
    }
}
