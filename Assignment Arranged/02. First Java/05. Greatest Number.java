import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println("The greatest number is : " + num1);
        }
        else {
            System.out.println("The greatest number is : " + num2);
        }
    }
}

// When the input is of the three number
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number : ");
        int num3 = input.nextInt();

        int max = num1;
        if(num2 > max) {
            max = num2;
        }
        if(num3 > max){
            max = num3;
        }

        System.out.println("The greatest number is : " + max);

        // if(num1 > num2){
        //     System.out.println("The greatest number is : " + num1);
        // }
        // else {
        //     System.out.println("The greatest number is : " + num2);
        // }
    }
}


// Also for three number can be done by below steps
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();

        System.out.println("Enter the third number : ");
        int num3 = input.nextInt();

        if(num1 > num2) {
            if(num1 > num3) {
                System.out.println("The greatest number : " + num1);
            }
        }

        if(num2 > num3) {
            if(num2 > num1) {
                System.out.println("The greatest number is : " + num2);
            }
        }

        if(num3 > num2) {
            if(num3 > num1) {
                System.out.println("The greatest number is : " + num3);
            }
        }
    }
}
