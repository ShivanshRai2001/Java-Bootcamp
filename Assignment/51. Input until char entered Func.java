import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
         

        System.out.println("Sum is : " + exit());
    }

    static int exit() {
        String choice = "";

        int sum = 0;
        int product = 1;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while(!choice.equals("x")){
            System.out.print("Enter a number or q to quit : ");
            choice = input.next();
        
            if(!choice.equals("x")){
                int number = Integer.parseInt(choice);
                sum = sum + number;
                product = product * number;
                count++;
            }
        }
        return sum;
    }
}
