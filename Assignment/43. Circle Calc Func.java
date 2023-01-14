import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of circle : ");
        float rad = input.nextInt();

        float ans = cal(rad);
    }

    static float cal(float radius) {
        float circum = 2 * 3.14f * radius;
        System.out.println("The circumfarance of the circle is : " + circum);

        float area = 3.14f * radius * radius;
        System.out.println("The area of th circle is : " + area);
        
        return radius;
    }
}
