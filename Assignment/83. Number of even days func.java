import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of days : ");
        int days = input.nextInt();

        System.out.print("The total number of even days is : " + even_day(days));
    }

    static int even_day(int days) {
        int sum = 0;
        for(int i=1; i<=days; i++) {
            if(i%2 == 0) {
                // sum += i;
                sum++;
            }
        }
        return sum;
    }
}
