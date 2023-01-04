import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int max = 1;

        while(true) {
            System.out.print("Enter the number : ");
            int num = input.nextInt();

            if(num > max) {
                max = num;
            }
            if(num == 0) {
                break;
            }
        }
        System.out.println("The max number is : " + max);
    }
}
