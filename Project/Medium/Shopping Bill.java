import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qty = 0;
        String name;

        System.out.println("Choose the option among the following :- ");
        System.out.println("A. Shop");
        System.out.println("B. Exit");
        System.out.print("Enter the option : ");
        char activity = input.next().trim().charAt(0);

        while(true) {
            if(activity == 'S' || activity == 's') {
                System.out.println("\nItems list is :- ");
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
                System.out.println("X. Bill");
                System.out.print("Choose the option : ");
                name = input.nextLine();
                // char item = input.next().trim().charAt(0);
                char item = name.trim().charAt(0);

                if(item == 'A' || item == 'a') {
                    // qty();
                    System.out.print("Enter the quantity : ");
                    qty = input.nextInt();
                    // name = item;
                    int bread_price = 40;
                    int bread = qty * bread_price;
                    
                }
                
                else if(item == 'X' || item == 'x') {
                    // bill();
                    // break;

                    System.out.println("\n\t*\t*\t Bill \t*\t*\t");
                    System.out.println("Sr No. \t\t Item \t\t Qty \t\t Price \t\t Total");
                    for(int i=1; i<=10; i++) {
                        System.out.println(i + " \t\t " + name + " \t\t " + qty + " \t\t " + bread_price + " \t\t ");
                    }
                }

                
            }

            else if(activity == 'E' || activity == 'e') {
                break;
            }
        }
    }

    static void qty() {
        Scanner input = new Scanner(System.in);

        // System.out.print("Enter the quantity : ");
        // int qty = input.nextInt();
    }

    // static void bill() {
    //     System.out.println("\n\t*\t*\t Bill \t*\t*\t");
    //     System.out.println("Sr No. \t\t Item \t\t Qty \t\t Price \t\t Total");
    //     for(int i=1; i<=10; i++) {
    //         System.out.println(i + " \t\t " +  + " \t\t ");
    //     }
    // }
}
