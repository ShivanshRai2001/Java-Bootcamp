import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name = input.nextLine();

        System.out.println("Good morning " + name + ", \nHave a nice day!");
    }
}
