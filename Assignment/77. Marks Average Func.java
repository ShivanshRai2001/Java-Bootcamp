import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of subject : ");
        int subject = input.nextInt();

        System.out.println("The average of marks is : " + mark_avg(subject));
    }

    static float mark_avg(float subj) {
        Scanner input = new Scanner(System.in);

        float sum = 0;

        for(int i=1; i<=subj; i++) {
            System.out.print("Enter the marks of " + i + " subject : ");
            float marks = input.nextInt();

            sum += marks;
        }
        float avg = sum / subj;
        return avg;
    }
}
