import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num : ");
        int n = input.nextInt();
        System.out.print("Enter the bad : ");
        int bad = input.nextInt();

        System.out.println(version(n, bad));
    }

    static int version(int n, int bad) {
        int start = 0;
        int end = n;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(isBadVersion(mid)==false) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
