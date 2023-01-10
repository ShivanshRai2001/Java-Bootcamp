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

//             we can write similar thing like thia also 
            case "Mango" -> System.out.println("The king of fruits.");
            
            case "Apple" -> System.out.println("Sweet red fruit.");

            case "Orange" -> System.out.println("The round fruit.");

            case "Grapes" -> System.out.println("The small fruit.");

            default -> System.out.println("Enter the valid fruit.");
        }


        System.out.print("Enter the number : ");
        int day = input.nextInt();

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            
            case 4:
                System.out.println("Thursday");
                break;

            case 5: 
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
        }

        // we can write this also in this way 
        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: 
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }

        // Enhanced of this is 
        switch(day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
