import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] str = {2, 1, 2, 3, 4, 0, 5, 6, 6, 6};
        
        int min = str[0];
        int max = 0;

        for(int i=0; i<str.length; i++) {
            if(min > str[i]) {
                min = str[i];
            }
            if(max < str[i]) {
                max = str[i];
            }
        }

        System.out.println(min + " " + max);


        // Another simple method


        int n = str.length;
        Arrays.sort(str);
        System.out.println(str[n-1] + str[0]);
    }
}
