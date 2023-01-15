import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = input.nextInt();
        leap(year);
    }

    static void leap(int year) {
        if(year % 4 == 0) {
            System.out.println("The entered year is Leap Year");
        }
        else {
            System.out.println("The entered year is not Leap Year.");
        }
    }
  
  // Also it can be written as
  static int leap(int year) {
        if(year % 4 == 0) {
            System.out.println("The entered year is Leap Year");
        }
        else {
            System.out.println("The entered year is not Leap Year.");
        }
        return year;
    }
}
