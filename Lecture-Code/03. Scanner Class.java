import java.util.Scanner;

public class Practice1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = input.nextInt();
        System.out.println("Entered number is : " + num);

        System.out.print("Enter the string : ");
        String name = input.nextLine();
        System.out.println("The entered string is : " + name);
    }
}
