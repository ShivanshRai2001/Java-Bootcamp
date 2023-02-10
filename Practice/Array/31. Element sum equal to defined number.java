import java.util.Arrays;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int[] arr = {1, 2, 4, 5, 6};
        System.out.println("Array is : " + Arrays.toString(arr));

        int sum;
        int i1 = 0;
        int i2 = 0;
        int value1 = 0;
        int value2 = 0;
        boolean ans = false;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == num) {
                    ans = true;
                    i1 = arr[i];
                    i2 = arr[j];
                    value1 = i;
                    value2 = j;
                    break;
                }
            }
        }

        if(ans) {
            System.out.println("The first number is : " + i1 + " and index : " + value1);
            System.out.println("The second number is : " + i2 + " and index : " + value2);
        }
        else {
            System.out.println("The sum does not exsits.");
        }
    }
}
