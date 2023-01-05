import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original price : ");
        float org_pr = input.nextFloat();

        System.out.print("Enter the discount percentage : ");
        float dic = input.nextFloat();

        float pe_pic = org_pr * (dic / 100);
        float dic_amt = org_pr - pe_pic;
        System.out.println("The discounted amount is : " + dic_amt);
    }
}
