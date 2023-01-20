import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of runs : ");
        float run = input.nextInt();

        System.out.print("Enter the number of innings played : ");
        float inn = input.nextInt();

        System.out.print("Enter the number of times not out : ");
        float nout = input.nextInt();

        System.out.println("The batting average is : " + bavg(run, inn, nout));
    }

    static float bavg(float run, float inn, float nout) {
        float bat_avg = (run / (inn - nout));
        return bat_avg;
    }
}
