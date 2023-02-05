import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {2, 4, 8, 9, 0, 4, 6};
        boolean found = false;

        System.out.print("Enter the character : ");
        int num = input.nextInt();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == num) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Yes present.");
        }
        else {
            System.out.println("Not present.");
        }
    }
}
