import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 6, 4, 3, 1};
        int even = 0;
        int odd = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Array is : " + Arrays.toString(arr));
        System.out.println("Total number of even elements are : " + even);
        System.out.println("Total number of odd elements are : " + odd);
    }
}
