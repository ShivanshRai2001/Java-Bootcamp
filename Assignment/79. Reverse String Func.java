import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = input.nextLine();

        System.out.println("Reverse string : " + reverse(str));
    }

    static String reverse(String str) {
        String rstr = "";

        for(int i=0; i<str.length(); i++) {
            rstr = str.charAt(i) + rstr;
        }
        return rstr;
    }
}
