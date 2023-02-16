import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int total = 1;
        int flag = 0;

        for(int i=0; i<n; i++) {
            if(arr[i] != 0) {
                total = total * arr[i];
            }
            else {
                flag += 1;
            }
        }

        for(int i=0; i<n; i++) {
            if(flag > 1) {
                arr[i] = 0;
            }
            else if(flag == 1) {
                if(arr[i] != 0) {
                    arr[i] = 0;
                }
                else {
                    arr[i] = total;
                }
            }
            else {
                arr[i] = total/arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
