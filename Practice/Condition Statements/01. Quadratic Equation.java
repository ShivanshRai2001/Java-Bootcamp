import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the term a : ");
        int a = input.nextInt();

        System.out.println("Enter the term b : ");
        int b = input.nextInt();

        System.out.println("Enter the term c : ");
        int c = input.nextInt();

        float under = ((b * b) - 4 * a * c);
        float und_sq = (float) Math.sqrt(under);

        if(und_sq > 0) {
            float r1 = ((-b + und_sq) / (2 * a));
            float r2 = ((-b - und_sq) / (2 * a));
            System.out.println("The roots are " + r1 + " and " + r2);
        } 
        else if (und_sq == 0.0) {
            float r1 = (-b / (2 * a));
            System.out.println("The root is " + r1);
        }
        else {
            System.out.println("The equation has no real roots.");
        }
    }
}
