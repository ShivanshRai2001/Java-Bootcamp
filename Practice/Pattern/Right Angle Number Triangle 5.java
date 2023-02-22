import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        for(int i=num; i>0; i--) {
            for(int x = num-i; x>0; x--) {
                System.out.print(" ");
            }
            for(int y=0; y<i; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
