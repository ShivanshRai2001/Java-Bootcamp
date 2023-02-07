import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2, 7, 4, -5, 11, 5, 20};
        int sum = 0;

        System.out.print("Enter the specific number : ");
        int spe = input.nextInt();

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                sum = arr[i] + arr[j];
                if(sum == spe) {
                    System.out.println("The pair are " + arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}
