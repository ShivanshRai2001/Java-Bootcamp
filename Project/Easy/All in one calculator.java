import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t ** All in one calculator. ** ");
        System.out.println("\nChoose options :- ");
        System.out.println("A. Simple Calculator.");
        System.out.print("Enter your choice : ");
        char process = input.next().trim().charAt(0);

        if(process == 'A' || process == 'a') {
            calculator();
        }
    }

    static void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose options :- ");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for Multiplication");
        System.out.println("/ for Division");
        System.out.println("s for Square");
        System.out.print("Enter your choice : ");
        char operation = sc.next().trim().charAt(0);

        if(operation == '+') {
            int sum = 0;
            System.out.print("\nEnter the no. of numbers to be taken : ");
            int add = sc.nextInt();

            for(int i=1; i<=add; i++) {
                System.out.print("Enter the " + i + " element : ");
                int add_num = sc.nextInt();
                sum += add_num;
            }
            System.out.println("The sum of the number is = " + sum);
        }

        else if(operation == '-') {
            System.out.print("Enter the first number : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second number : ");
            int num2 = sc.nextInt();

            int sub = num1 - num2;
            System.out.println("The subtraction of number is = " + sub);
        }
    }
}
