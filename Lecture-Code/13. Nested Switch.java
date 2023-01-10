import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Employee ID : ");
        int empID = input.nextInt();
        System.out.print("Enter the department : ");
        String dep = input.next();

        switch(empID) {
            case 1:
                System.out.println("Rahul");
                break;
            
            case 2:
                System.out.println("Mohit");
                break;

            case 3:
                System.out.println("Employee Number 3.");
                switch(dep) {
                    case "IT":
                        System.out.println("IT Department.");
                        break;
                    
                    case "Management":
                        System.out.println("Management Department.");
                        break;
                    
                    default:
                        System.out.println("No department entered.");
                }
                break;

            default:
                System.out.println("Enter the valid Employee ID");
        }
    }
}
