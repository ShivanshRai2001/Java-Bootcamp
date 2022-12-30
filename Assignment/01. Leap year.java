import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = input.nextInt();
        
        int leap_year = year % 4;

        if(leap_year == 0){
            System.out.println("The entered year is leap year.");
        }
        else{
            System.out.println("It is not a leap year.");
        }
    }
}
