import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {1, 8, 7, 6, 2, 4, 3};
        int index = -1;

        System.out.println("Enter the number for its index : ");
        int num = input.nextInt();

        int i=0;
        while(i<arr.length) {
            if(arr[i] == num) {
                index = i;
                break;
            }
            i++;
        }

        System.out.println("Index of "+ num +" is : "+ index);
    }
}
