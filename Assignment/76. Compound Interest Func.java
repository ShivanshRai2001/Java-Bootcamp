import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        float p_amt = input.nextFloat();

        System.out.print("Enter the percentage rate : ");
        float rate = input.nextFloat();

        System.out.print("Enter the time : ");
        float time = input.nextFloat();

        System.out.println("The compound interest is : " + comp_in(p_amt, rate, time));
    }

    static float comp_in(float p_amt, float rate, float time) {
        float x = 1 + (rate / 100);
        float amt = (float) (p_amt * Math.pow(x, time));

        float CI = amt - p_amt;
        return CI;
    }
}
