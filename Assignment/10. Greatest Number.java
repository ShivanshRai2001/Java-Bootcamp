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
