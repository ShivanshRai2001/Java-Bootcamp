import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int sum = 0;
        for(int i=1; i<num; i++) {
            if(num%i == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the factorial of number is : " + sum);

        if(sum == num) {
            System.out.println("Perfect number.");
        }
        else {
            System.out.println("Not a perfect number.");
        }
    }
}
