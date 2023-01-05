import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of runs : ");
        int run = input.nextInt();

        System.out.print("Enter the number of innings played : ");
        int inn = input.nextInt();

        System.out.print("Enter the number of times not out : ");
        int nout = input.nextInt();

        float bat_avg = (run / (inn - nout));
        System.out.println("Batting average is : " + bat_avg);
    }
}
