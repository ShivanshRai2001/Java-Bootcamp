import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int pro = 1;
        int sum = 0;
        while(num > 0) {
            sum += (num % 10);
            pro *= (num % 10);
            num /= 10;
        }
        System.out.println(sum);
        System.out.println(pro);
        System.out.println(pro - sum);
    }
}
