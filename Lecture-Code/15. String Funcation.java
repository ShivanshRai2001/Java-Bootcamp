public class Practice2 {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }

    static String greet() {
        String greeting = "Hello!";
        return greeting;
    }
}


// Passing variable
public class Practice2 {
    public static void main(String[] args) {
        String personal_message = greet("Rahul");
        System.out.println(personal_message);
    }

    static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }
}


// using Scanner in this 
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the name : ");
        String name = input.next();

        String personal_message = greet(name);
        System.out.println(personal_message);
    }

    static String greet(String name) {
        String message = "Hello " + name;
        return message;
    }
}
