import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the character : ");
        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("The entered character is in Lowercase");
        }
        else {
            System.out.println("The enterd character is in Uppercase");
        }
    }
}
