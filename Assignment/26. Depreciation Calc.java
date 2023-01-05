import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the asset amount : ");
        float ase = input.nextFloat();

        System.out.print("Enter the salvage value : ");
        float sal = input.nextFloat();

        System.out.print("Enter the depreciation years : ");
        float dep = input.nextFloat();

        float ans = (ase - sal) / dep;
        System.out.println("The depreciation amount is : " + ans);
    }
}
