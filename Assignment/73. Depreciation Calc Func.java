import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the asset amount : ");
        float ase = input.nextFloat();

        System.out.print("Enter the salvage value : ");
        float sal = input.nextFloat();

        System.out.print("Enter the depreciation years : ");
        float year = input.nextFloat();

        System.out.println("Tha answer is : " + dep(ase, sal, year));
    }

    static float dep(float ase, float sal, float dep) {
        float ans = (ase - sal) / dep;
        return ans;
    }
}
