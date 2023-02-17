import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        int traversal = 1;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == traversal) {
                traversal++;
            }
        }

        System.out.println(traversal);
    }
}
