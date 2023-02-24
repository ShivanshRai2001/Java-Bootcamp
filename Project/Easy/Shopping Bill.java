import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the option among the following :- ");
        System.out.println("1. Shop");
        System.out.println("2. Exit");
        System.out.print("Enter the option : ");
        char activity = input.next().trim().charAt(0);

        if(activity == 'S' || activity == 's') {
            System.out.println("Items list is :- ");
            System.out.println("A. Bread");
            System.out.println("B. Rice");
            System.out.println("C. Oil");
            System.out.println("D. Sauces");
            System.out.println("E. Cheese");
            System.out.println("F. Milk");
            System.out.println("G. Chips");
            System.out.println("H. Curd");
            System.out.println("I. Butter");
            System.out.println("J. Ice Cream");
            System.out.print("Choose the option : ");
            char item = input.next().trim().charAt(0);

            
        }
    }
}
