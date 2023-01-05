import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int ele = input.nextInt();

        int sum = 0;
        int avg = 0;

        for(int i=1; i<ele+1; i++) {
            System.out.print("Enter the " + i + " number : ");
            int num = input.nextInt();
            sum = sum + num;
            avg = sum / i;
        }
        System.out.println("Sum of the number is : " + sum);
        System.out.println("The avg is : " + avg);
    }
}
