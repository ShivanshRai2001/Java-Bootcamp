import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number to find factors : ");
        int num = input.nextInt();

        System.out.print("The factorials are : ");
        for(int i=2; i<num; i++) {
            if(num%i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
