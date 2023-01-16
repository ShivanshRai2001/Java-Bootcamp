import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();

        hcf(num1, num2);
    }

    static void hcf(int num1, int num2) {
        int hcf = 0;
        for(int i=1; i<=num1 || i<=num2; i++) {
            if(num1%i == 0 && num2%i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF is : " + hcf);
        int lcm = 0;
        lcm = (num1 * num2) / hcf;
        System.out.println("The LCM is : " + lcm);
    }
}
