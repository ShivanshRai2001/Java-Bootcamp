import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The largest number is : " + larg());
    }

    static int larg() {
        Scanner input = new Scanner(System.in);
        int large = 0;
        while(true) {

            System.out.print("Enter the number : ");
            int num = input.nextInt();

            if(num > large) {
                large = num;
            }
            else if(num == 0) {
                break;
            }
        }
        return large;
    }
}
