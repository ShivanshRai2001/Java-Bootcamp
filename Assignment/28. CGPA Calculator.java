import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of subjects : ");
        int num = input.nextInt();

        float gp = 0;
        float gp_add = 0;
        float mar_per = 0;

        for(int i=1; i<=num; i++) {
            System.out.print("Enter the marks of " + i + " subject : ");
            float marks = input.nextFloat();

            if(marks >= 91 && marks <= 100) {
                gp = 10;
            }
            else if(marks >= 81 && marks <= 90) {
                gp = 9;
            }
            else if(marks >= 71 && marks <= 80) {
                gp = 8;
            }
            else if(marks >= 61 && marks <= 70) {
                gp = 7;
            }
            else if(marks >= 51 && marks <= 60) {
                gp = 6;
            }
            else if(marks >= 41 && marks <= 50) {
                gp = 5;
            }
            else if(marks >= 31 && marks <= 40) {
                gp = 4;
            }
            else if(marks >= 21 && marks <= 30) {
                gp = 3;
            }
            else if(marks >= 11 && marks <= 20) {
                gp = 2;
            }
            else if(marks >= 1 && marks <= 10) {
                gp = 1;
            }

            System.out.print("GP of " + i + " subject is : " + gp + "\n");

            gp_add += gp;
            mar_per += marks;
        }

        float CGPA = gp_add / num;
        System.out.println("The CGPA is : " + CGPA);

        float per = (mar_per / num);
        System.out.println("The percentage is : " + per + "%.");
    }
}
