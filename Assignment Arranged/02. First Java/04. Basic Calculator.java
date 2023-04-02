import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.print("Enter the operation : ");
        char opr = input.next().charAt(0);
        
        if(opr == '+') {
            int sum = num1 + num2;
            System.out.println("The sum of the two number is : " + sum);
        }
        else if(opr == '-') {
            int sub = num1 - num2;
            System.out.println("The subtraction of two number is : " + sub);
        }
        else if(opr == '*') {
            int mul = num1 * num2;
            System.out.println("The multiplication of two number is : " + mul);
        }
        else if(opr == '/') {
            int div = num1 / num2;
            System.out.println("The division of the two number is : " + div);
        }
        else {
            System.out.println("Invalid value");
        }
    }
}
