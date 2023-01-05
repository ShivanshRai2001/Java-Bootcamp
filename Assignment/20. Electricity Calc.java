import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the appliance.");
        System.out.println("A - AC");
        System.out.println("F - Fan");
        System.out.println("H - Heater");
        System.out.print("Enter your appliance : ");
        char app = input.next().trim().charAt(0);

        float k_watt_p = 12;

        if(app == 'a' || app == 'A') {
            float ac_pow_con = 600;
            System.out.print("Enter the hours of use per day : ");
            float ac_hours = input.nextFloat();

            float e_ac = ac_pow_con * ac_hours / 1000;
            float c_ac = e_ac * k_watt_p;
            System.out.println("Electricity cost per day : " + c_ac);
            System.out.println("Electricity cost per month : " + c_ac * 31);
            System.out.println("Electricity cost per year : " + c_ac * 365);
        }

        if(app == 'f' || app == 'F') {
            float fan_pow_con = 70;
            System.out.print("Enter the hours of use per day : ");
            float fan_hours = input.nextFloat();

            float e_fan = fan_pow_con * fan_hours / 1000;
            float c_fan = e_fan * k_watt_p;
            System.out.println("Electricity cost per day : " + c_fan);
            System.out.println("Electricity cost per month : " + c_fan * 31);
            System.out.println("Electricity cost per year : " + c_fan * 365);
        }

        if(app == 'h' || app == 'H') {
            float heat_pow_con = 2000;
            System.out.print("Enter the hours of use per day : ");
            float heat_hours = input.nextFloat();

            float e_heat = heat_pow_con * heat_hours / 1000;
            float c_heat = e_heat * k_watt_p;
            System.out.println("Electricity cost per day : " + c_heat);
            System.out.println("Electricity cost per month : " + c_heat * 31);
            System.out.println("Electricity cost per year : " + c_heat * 365);
        }
    }
}
