import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the marks : ");
        float marks = input.nextFloat();

        grade(marks);
    }

    static void grade(float num) {
        if(num >= 91 && num <= 100) {
            System.out.println("The grade is - AA");
        }

        if(num >= 81 && num <= 90) {
            System.out.println("The grade is - AB");
        }

        if(num >= 71 && num <= 80) {
            System.out.println("The grade is - BB");
        }

        if(num >= 61 && num <= 70) {
            System.out.println("The grade is - BC");
        }

        if(num >= 51 && num <= 60) {
            System.out.println("The grade is - CD");
        }

        if(num >= 41 && num <= 50) {
            System.out.println("The grade is - DD");
        }

        if(num <= 40) {
            System.out.println("Fail!");
        }
    }
}
