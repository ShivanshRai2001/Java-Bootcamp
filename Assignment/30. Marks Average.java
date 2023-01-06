import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subject : ");
        int num = input.nextInt();

        float sum = 0;

        for(int i=1; i<=num; i++) {
            System.out.print("Enter the marks of " + i + " subject : ");
            float marks = input.nextInt();

            sum += marks;
        }

        float avg = sum / num;
        System.out.println("The average of marks is : " + avg);
    }
}
