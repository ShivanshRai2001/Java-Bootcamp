import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number to print its multiplcations : ");
        int num = input.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
