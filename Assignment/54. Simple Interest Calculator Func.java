import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount : ");
        int pri_amt = input.nextInt();
        System.out.print("Enter the rate : ");
        int rate = input.nextInt();
        System.out.print("Enter the time duration : ");
        int time = input.nextInt();

        int ans = simple_interest(pri_amt, rate, time);
        System.out.println("The simple interest is : " + ans);
        int tot = total(pri_amt, rate, time);
        System.out.println("The total amount is : " + tot);
    }

    static int simple_interest(int principle, int rate, int time) {
        int simple_int = (principle * time * rate) / 100;
        return simple_int;
    }

    static int total(int principle, int rate, int time) {
        int simple_int = (principle * time * rate) / 100;
        int total = simple_int + principle;
        return total;
    }
}
