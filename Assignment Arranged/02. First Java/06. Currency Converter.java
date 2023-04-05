import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount in rupee : ");
        float rup = input.nextInt();

        float doller = rup * 0.012f;
        System.out.println("The value in dollars is : " + doller + "$");
    }
}
