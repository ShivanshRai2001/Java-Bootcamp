import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = input.nextLine();

        String rstr = "";

        for(int i=0; i<str.length(); i++) {
            rstr = str.charAt(i) + rstr;
        }

        System.out.println("Reverse string : " + rstr);
    }
}
