import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 3};
        int extra = 3;
        int sum = 0;

        ArrayList<Boolean> list = new ArrayList<Boolean>(arr.length); 
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        for(int i=0; i<arr.length; i++) {
            list.add(i, (arr[i] + extra >= max));
        }

        System.out.println(list);
    }
}
