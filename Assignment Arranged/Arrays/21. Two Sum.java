import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        boolean ans = false;
        int index1 = 0;
        int index2 = 0;
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for(int i=0; i<num.length; i++) {
            for(int j=i; j<num.length; j++) {
                int sum = num[i] + num[j];
                if(sum == target) {
                    ArrayList<Integer> inner_list = new ArrayList<Integer>();
                    ans = true;
                    index1 = j;
                    inner_list.add(j);
                    index2 = i;
                    inner_list.add(i);
                    list.add(inner_list);
                }
            }
        }

        if(ans) {
            System.out.println("The number are : " + index1 + " and " + index2);
            System.out.println(list);
        }
        else {
            System.out.println("The sum does not exist.");
        }
    }
}
