import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 6, 2};

        System.out.println("Original string : " + Arrays.toString(arr));

        int unq = arr.length;

        for(int i=0; i<unq; i++) {
            for(int j=i+1; j<unq; j++) {
                if(arr[i] == arr[j]) {
                    arr[j] = arr[unq - 1];
                    unq--;
                    j--;
                }
            }
        }


        int[] arr1 = Arrays.copyOf(arr, unq);

        System.out.println("Unique value array : " + Arrays.toString(arr1));
    }   
}
