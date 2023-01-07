import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the numbers.");
        System.out.println("Press 0 to exit.");

        int neg_sum = 0;
        int even_sum = 0;
        int odd_sum = 0;

        while(true) {
            System.out.print("Enter the number : ");
            int num = input.nextInt();

            if(num<0) {
                neg_sum += num;
            }
            if(num>0) {
                if(num%2 == 0) {
                    even_sum += num;
                }
                else {
                    odd_sum += num;
                }
            }
            if(num == 0) {
                break;
            }
        }
        System.out.println("Sum of negative number is : " + neg_sum);
        System.out.println("Sum of even number is : " + even_sum);
        System.out.println("Sum of odd number is : " + odd_sum);
    }
}
