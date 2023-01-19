import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original price : ");
        float org_pr = input.nextInt();

        System.out.print("Enter the discount percentage : ");
        float dis = input.nextInt();

        System.out.println("The discount amount is : " + dis(org_pr, dis));
    }

    static float dis(float org_pr, float dis) {
        float pe_pic = org_pr * (dis / 100);
        float dic_amt = org_pr - pe_pic;
        return dic_amt;
    }
}
