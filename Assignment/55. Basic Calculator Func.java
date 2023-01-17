import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number : ");
        float num2 = input.nextFloat();
        System.out.print("Enter the operation : ");
        char op = input.next().charAt(0);

        if(op == '+') {
            sum(num1, num2);
        }
        else if(op == '-') {
            sub(num1, num2);
        }
        else if(op == '*') {
            mul(num1, num2);
        }
        else if(op == '/') {
            div(num1, num2);
        }
    }

    static void sum(float num1, float num2) {
        float sum = num1 + num2;
        System.out.println("The sum of the number is : " + sum);
        // return sum;
    }

    static void sub(float num1, float num2) {
        float sub = num1 - num2;
        System.out.println("The subtraction of number is : " + sub);
        // return sub;
    }

    static void mul(float num1, float num2) {
        float mul = num1 * num2;
        System.out.println("The multiplication of number is : " + mul);
        // return mul;
    }

    static void div(float num1, float num2) {
        float div = num1 / num2;
        System.out.println("The division of number is : " + div);
        // return div;
    }
}


// Another way to write is
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second number : ");
        float num2 = input.nextFloat();
        System.out.print("Enter the operation : ");
        char op = input.next().charAt(0);

        calc(num1, num2, op);
    }

    static void calc(float num1, float num2, char op) {
        if(op == '+') {
            float sum = num1 + num2;
            System.out.println("The sum of the number is : " + sum);
        }

        else if(op == '-') {
            float sub = num1 - num2;
            System.out.println("The subtraction of number is : " + sub);
        }

        else if(op == '*') {
            float mul = num1 * num2;
            System.out.println("The multiplication of number is : " + mul);
        }
        else if(op == '/') {
            float div = num1 / num2;
            System.out.println("The division of number is : " + div);
        }
    }
}
