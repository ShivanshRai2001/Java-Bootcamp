import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        int principle = input.nextInt();

        System.out.print("Enter the rate of the amount : ");
        int rate = input.nextInt();

        System.out.print("Enter the time duration of interest : ");
        int time = input.nextInt();

        // int simple_interest = principle * (1 + rate * time);
        int simple_interest = (principle * time * rate) / 100;
        System.out.println("The interest earned is : " + simple_interest);

        int total_value = simple_interest + principle;
        System.out.println("The total value is : " + total_value);
    }
}
