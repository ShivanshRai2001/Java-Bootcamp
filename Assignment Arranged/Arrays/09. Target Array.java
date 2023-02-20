import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] ind = {0, 1, 2, 2, 1};
        int[] ans = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        for(int i=0; i<arr.length; i++) {
            list.add(ind[i], arr[i]);
        }

        for(int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
