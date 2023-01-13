import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = input.nextInt();

        int ans = age(age);
    }

    static int age(int age) {
        if(age >= 18) {
            System.out.println("Eligible to vote.");
        }
        else {
            System.out.println("Not eligible to vote.");
        }
        return age;
    }
}
