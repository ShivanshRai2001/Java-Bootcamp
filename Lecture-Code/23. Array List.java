import java.util.ArrayList;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(32);
        list.add(3231);
        list.add(5);
        list.add(32453);
        list.add(3221);
        list.add(453);
        list.add(345);
        list.add(3454534);

        System.out.println(list);

        System.out.println(list.contains(5));

        list.remove(5);
        System.out.println(list);

        list.set(0, 99);
        System.out.println(list);

        // Input
        for(int i=0; i<5; i++) {
            System.out.println("Enter the " + i + " elements : ");
            list.add(input.nextInt());
        }

        for(int i=0; i<5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
    }
}

>>>>>>> e484c74af616bd190ea14bd912d658ff86af672b