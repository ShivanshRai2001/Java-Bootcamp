import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0,3,0,5,0,6};
        int[] narr = new int[9];
        int i=0; 

        System.out.println(Arrays.toString(arr));

        for(int j=0, l=arr.length; j<l;) {
            if(arr[j] == 0) {
                j++;
            }
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i ++;
                j ++;
            }
        }

        while (i < arr.length) {
            arr[i++] = 0;
        }
            
        System.out.println(Arrays.toString(arr));
    }
}
