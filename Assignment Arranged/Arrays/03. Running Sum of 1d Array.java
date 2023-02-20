import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int sum = 0;

        for(int i=0; i<num.length; i++) {
            sum += num[i];
            num[i] = sum;
        }

        System.out.println(Arrays.toString(num));
    }
}
