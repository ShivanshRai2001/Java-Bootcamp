import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number for its table : ");
        int num = input.nextInt();

        mul(num);
    }

    static void mul(int num) {
        for(int i=1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }
}
