import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        System.out.print("Enter the pick number : ");
        int pick = input.nextInt();

        System.out.println(guess(num, pick));
    }

    static int guess(int num, int pick) {
        int start = 0;
        int end = num;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(pick == mid) {
                return mid;
            }
            else if(pick > mid) {
                start = mid + 1;
            }
            else if (pick < mid) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
