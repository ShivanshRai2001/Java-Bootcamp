// using simple method
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        boolean ans = false;

        for(int i=0; i<num; i++) {
            if(i * i == num) {
                ans = true;
            }
        }
        
        System.out.println(ans);
    }
}
