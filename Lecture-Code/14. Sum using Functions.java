import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        sum();      // Funcation call
    }

    static void sum() {     // Funcation declaration
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the number is : " + sum);
    }
}


// It can also be written as the following way : 
import java.util.Scanner;

public class Practice2 {
    // Return Value
    public static void main(String[] args) {
        int ans = sum();      // Funcation call
        System.out.println("The sum of the number is : " + ans);
    }

    static int sum() {     // Funcation declaration
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        // System.out.println("The sum of the number is : " + sum);
        return sum;
    }
}
