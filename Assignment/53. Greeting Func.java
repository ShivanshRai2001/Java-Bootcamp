import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name : ");
        String name = input.next();

        greet(name);
    }

    static void greet(String name) {
        System.out.println("Hello");
        System.out.println("Have a good day " + name + "!");
    }
}
