import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to be counter occurance : ");
        int num = input.nextInt();

        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if(rem == 5) {
                count ++;
            }
            num = num / 10;
        }

        System.out.println("The apprearance of 5 is : " + count);
    }
}
