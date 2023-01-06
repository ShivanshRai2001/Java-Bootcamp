import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Enter the choise of permutation or combination.");
            System.out.println("P - Permutation");
            System.out.println("C - Combination");
            System.out.println("E - Exit");
            System.out.print("Enter your option : ");
            char sel = input.next().trim().charAt(0);
    
            if(sel == 'P' || sel == 'p') {
                System.out.print("Enter total number of elements : ");
                int p_ele = input.nextInt();
    
                System.out.print("Enter the elements that has to be arranged : ");
                int p_arr = input.nextInt();
    
                int p1 = 1;
                for(int i=1; i<=p_ele; i++) {
                    p1 = p1 * i; // Factorial
                }
    
                int den1 = p_ele - p_arr;
                int p2 = 1;
                for(int i=1; i<=den1; i++) {
                    p2 = p2 * i;
                }
    
                int per = p1 / p2;
                System.out.println("Permutation is : " + per);
            }
    
            else if(sel == 'C' || sel == 'c') {
                System.out.print("Enter total number of elements : ");
                int c_ele = input.nextInt();
    
                System.out.print("Enter the elements to be selected : ");
                int c_sel = input.nextInt();
    
                int c1 = 1;
                for(int i=1; i<=c_ele; i++) {
                    c1 = c1 * i;
                }
                System.out.println("c1 = " + c1);
    
                int den2 = c_ele - c_sel;
                int c2 = 1;
                for(int i=1; i<=den2; i++) {
                    c2 = c2 * i;
                }
                System.out.println("c2 = " + c2);
    
                int r = 1;
                for(int i=1; i<=c_sel; i++) {
                    r = r * i;
                }
                System.out.println("r = " + r);
    
                int d_com = c2 * r;
                int com = c1 / d_com;
                System.out.println("Combination is : " + com);
            }

            else if(sel == 'E' || sel == 'e') {
                break;
            }

            else {
                System.out.println("Invalid Input.");
            }
        }
    }
}
