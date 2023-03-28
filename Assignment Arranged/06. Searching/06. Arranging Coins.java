import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = in.nextInt();

        int start = 1;
        int end = num;
        int ans = 0;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if((mid * (mid + 1))/2 <= num) { 
                ans = mid;
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        System.out.print(ans);
    }
}
