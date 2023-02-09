import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2, 5};

        Arrays.sort(arr);
        int ans = 0;
        int count = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);

        for (int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                list.add(arr[i]);
            }
        }

        for(int i=0; i<list.size(); i++) {
            if(i>0 && list.get(i) == list.get(i-1)+1) {
                count++;
            }
            else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        System.out.println("The new length of the array is : " + ans);
    }
}
