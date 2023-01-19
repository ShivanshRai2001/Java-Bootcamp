import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the n number : ");
        int num = input.nextInt();

        System.out.println("The average of the number is : " + avg(num));
    }

    static int avg(int num) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int avg = 0;
        for(int i=1; i<=num; i++) {
            System.out.print("Enter the " + i + " number : " );
            int all_num = input.nextInt();
            sum += all_num;
            avg = sum / i;
        }
        return avg;
    }
}
