import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hcf = 0;

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        // HCF Code
        for(int i=1; i<=num1||i<=num2; i++) {
            if(num1%i == 0 && num2%i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF of the number is : " + hcf);

        // LCM Code
        int lcm = (num1 * num2) / hcf;
        System.out.println("The LCM of the number is : " + lcm);
    }
}
