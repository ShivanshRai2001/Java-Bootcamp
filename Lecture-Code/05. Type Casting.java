import java.util.Scanner;

public class Practice1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Type conversion from int to float
        float num = input.nextInt();
        System.out.println(num);

        // Type casting from float to int
        int num1 = (int)(65.98f);
        System.out.println(num1);
    }
}
