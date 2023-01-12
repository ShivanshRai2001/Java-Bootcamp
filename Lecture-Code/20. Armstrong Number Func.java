import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println(isArmstrong(num));

        // To print the armstrong number in a number range
        for(int i=100; i<1000; i++) {
            if(isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while(n>0) {
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }

        if(sum == original) {
            return true;
        }
        return false;
    }
}
