import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n\t ** All in one calculator. ** ");
        System.out.println("\nChoose options :- ");
        System.out.println("1 for Simple Calculator.");
        System.out.println("2 for Basic Converters.");
        System.out.println("3 for Diatance converstions.");
        System.out.print("Enter your choice : ");
        // char process = input.next().trim().charAt(0);
        int process = input.nextInt();

        if(process == 1) {
            calculator();
        }

        else if(process == 2) {
            converters();
        }
    }

    static void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose options :- ");
        System.out.println("+ for Addition");
        System.out.println("- for Subtraction");
        System.out.println("* for Multiplication");
        System.out.println("/ for Division");
        System.out.println("p for Power");
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
            System.out.print("\nEnter the first number : ");
            int min_num1 = sc.nextInt();
            System.out.print("Enter the second number : ");
            int min_num2 = sc.nextInt();

            int sub = min_num1 - min_num2;
            System.out.println("The subtraction of number is = " + sub);
        }

        else if(operation == '*') {
            int pro = 1;
            System.out.print("\nEnter the no. of number to be taken : ");
            int mul = sc.nextInt();

            for(int i=1; i<=mul; i++) {
                System.out.print("Enter the " + i + " element : ");
                int pro_num = sc.nextInt();
                pro *= pro_num;
            }
            System.out.println("The multiplication of the number is = " + pro);
        }

        else if(operation == '/') {
            System.out.print("\nEnter the first number : ");
            double Div_num1 = sc.nextInt();
            System.out.print("Enter the second number : ");
            double Div_num2 = sc.nextInt();

            double div = Div_num1 / Div_num2;
            System.out.println("The division of number is = " + div);
        }

        else if(operation == 'p') {
            System.out.print("\nEnter the number : ");
            int pow_num = sc.nextInt();
            System.out.print("Enter the power : ");
            int pow = sc.nextInt();
            
            int actual = pow;
            int power = 1;
            while(pow != 0) {
                power *= pow_num;
                --pow;
            }

            System.out.println(pow_num + " to the power " + actual + " is = " + power);
        }
    }

    static void converters() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose options :- ");
        System.out.println("A for Temperature");
        System.out.println("B for Currency");
        System.out.print("Enter your choice : ");
        char operation = sc.next().trim().charAt(0);

        if(operation == 'A' || operation == 'a') {
            System.out.println("Enter the type of converstion :- ");
            System.out.println("A for celcius to feranite.");
            System.out.println("B for feranite to celcius.");
            System.out.println("Enter the option : ");
            char type = sc.next().trim().charAt(0);

            if(type == 'A' || type == 'a') {

            }
        }
    }
}
