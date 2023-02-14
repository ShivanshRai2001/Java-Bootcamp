import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month number : ");
        int month = input.nextInt();

        System.out.print("Enter the year : ");
        int year = input.nextInt();

        String month_name = "Unknown";
        int no_of_day = 0;

        switch(month) {
            case 1 :
                month_name = "January";
                no_of_day = 31;
            break;

            case 2 :
                month_name = "Febuary";
                if((year % 4 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
                    no_of_day = 29;
                }
                else {
                    no_of_day = 28;
                }
            break;

            case 3 :
                month_name = "March";
                no_of_day = 31;
            break;

            case 4 :
                month_name = "April";
                no_of_day = 30;
            break;

            case 5 :
                month_name = "May";
                no_of_day = 31;
            break;
            
            case 6 :
                month_name = "June";
                no_of_day = 30;
            break;

            case 7 :
                month_name = "July";
                no_of_day = 31;
            break;

            case 8 :
                month_name = "August";
                no_of_day = 31;
            break;

            case 9 :
                month_name = "September";
                no_of_day = 30;
            break;

            case 10 :
                month_name = "Octuber";
                no_of_day = 31;
            break;

            case 11 :
                month_name = "November";
                no_of_day = 30;
            break;

            case 12 :
                month_name = "December";
                no_of_day = 31;
            break;
        }

        System.out.print(month_name + " " + year + " has " + no_of_day + " days\n");
    }
}
