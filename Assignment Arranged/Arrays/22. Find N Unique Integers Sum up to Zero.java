import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = input.nextInt();

        int[] ans = new int[n];
        int start = 0;
        int end = n-1;

        while(start < end) {
            ans[start] = start + 1;
            ans[end] = ans[start] * (-1);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(ans));
    }
}
