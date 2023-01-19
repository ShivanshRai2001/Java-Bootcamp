import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The sum is : " + sum());
    }

    static int sum() {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        while(true) {
            System.out.print("Enter the number : ");
            int num = input.nextInt();
            if(num == 0) {
                break;
            }
            else {
                sum += num;
            }
        }
        return sum;
    }
}
