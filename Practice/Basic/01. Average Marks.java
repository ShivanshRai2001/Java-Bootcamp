import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        int avg = 0;

        for(int i=0; i<num; i++) {
            System.out.print("Enter the name : ");
            char name = input.next().charAt(0);
            
            System.out.print("M1 : ");
            int mar1 = input.nextInt();
            System.out.print("M2 : ");
            int mar2 = input.nextInt();
            System.out.print("M3 : ");
            int mar3 = input.nextInt();

            avg = ((mar1 + mar2 + mar3) / 3);

            System.out.println("Result");
            System.out.print(name + " " + + avg);
        }
    }

    class Pair{
        char name;
        int avg;
        
        Pair(char name, int avg) {
            this.name = name;
            this.avg = avg;
        }
    }

    public static Pair ans(char name, int mar1, int mar2, int mar3) {
        int total = mar1 + mar2 + mar3;
        int avg = total / 3;
        return new Pair(name, avg);
    }
}
