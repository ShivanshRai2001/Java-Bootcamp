import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fruit : ");
        String fruit = input.next();

        switch(fruit) {
            case "Mango":
                System.out.println("The king of fruits.");
                break;
            
            case "Apple":
                System.out.println("Sweet red fruit.");
                break;

            case "Orange":
                System.out.println("The round fruit.");
                break;

            case "Grapes":
                System.out.println("The small fruit.");
                break;

            default:
                System.out.println("Enter the valid fruit.");
        }
        
        // we can write similar thing like thia also 
            case "Mango" -> System.out.println("The king of fruits.");
            
            case "Apple" -> System.out.println("Sweet red fruit.");

            case "Orange" -> System.out.println("The round fruit.");

            case "Grapes" -> System.out.println("The small fruit.");

            default -> System.out.println("Enter the valid fruit.");
    }
}
