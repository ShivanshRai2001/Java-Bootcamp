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


// using binary search
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        System.out.println(square(num));
    }

    static boolean square(int num) {
        int start = 1;
        int end = num;

        while(start <= end) {
            int mid = start + (end - start)/2;

            if(mid*mid == num) {
                return true;
            }
            else if(mid*mid < num) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}
