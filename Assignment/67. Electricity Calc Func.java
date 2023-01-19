import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float k_watt_p = 12;

        System.out.println("Select the appliance.");
        System.out.println("A - AC");
        System.out.println("F - Fan");
        System.out.println("H - Heater");
        System.out.print("Enter your appliance : ");
        char app = input.next().trim().charAt(0);

        System.out.print("Enter the hours : ");
        int hrs = input.nextInt();

        if(app == 'A' || app == 'a') {
            ac(app, k_watt_p);
        }
        else if(app == 'F' || app == 'f') {
            fan(hrs, k_watt_p);
        }
        else if(app == 'H' || app == 'h') {
            heat(hrs, k_watt_p);
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    static void ac(int hrs, float k_watt_p) {
        Scanner input = new Scanner(System.in);

        float ac_pow_con = 600;

        float e_ac = ac_pow_con * hrs / 1000;
        float c_ac = e_ac * k_watt_p;
        System.out.println("Electricity cost per day : " + c_ac);
        System.out.println("Electricity cost per month : " + c_ac * 31);
        System.out.println("Electricity cost per year : " + c_ac * 365);
    }

    static void fan(int hrs, float k_watt_p) {
        Scanner input = new Scanner(System.in);

        float fan_pow_con = 70;

        float e_fan = fan_pow_con * hrs / 1000;
        float c_fan = e_fan * k_watt_p;
        System.out.println("Electricity cost per day : " + c_fan);
        System.out.println("Electricity cost per month : " + c_fan * 31);
        System.out.println("Electricity cost per year : " + c_fan * 365);
    }

    static void heat(int hrs, float k_watt_p) {
        Scanner input = new Scanner(System.in);

        float fan_pow_con = 70;

        float e_fan = fan_pow_con * hrs / 1000;
        float c_fan = e_fan * k_watt_p;
        System.out.println("Electricity cost per day : " + c_fan);
        System.out.println("Electricity cost per month : " + c_fan * 31);
        System.out.println("Electricity cost per year : " + c_fan * 365);
    }
}
