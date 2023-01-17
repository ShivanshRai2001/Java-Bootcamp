import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the indian currency amount : ");
        float inr = input.nextFloat();

        System.out.println("The currency in dollar is : " + dlr(inr) + "$");
    }

    static float dlr(float inr) {
        float doller = inr * 0.012f;
        return doller;
    }
}
