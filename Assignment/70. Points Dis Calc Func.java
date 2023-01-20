import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the x1 point : ");
        int x1 = input.nextInt();

        System.out.print("Enter the x2 point : ");
        int x2 = input.nextInt();

        System.out.print("Enter the y1 point : ");
        int y1 = input.nextInt();

        System.out.print("Enter the y2 point : ");
        int y2 = input.nextInt();

        int ans = pt_dist(x1, x2, y1, y2);
        System.out.println("The distance between the point is : " + ans);
    }

    static int pt_dist(int x1, int x2, int y1, int y2) {
        int calc = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));;
        int res =  (int)Math.sqrt(calc);
        return res;
    }
}
