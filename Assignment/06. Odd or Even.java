import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if(num % 2 == 0) {
            System.out.println("The number is even.");
        }
        else {
            System.out.println("The number is not even.");
        }
    }
}
