import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 6, 8, 3};

        System.out.println("Original Array : " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("The second smallest element is : " + arr[1]);
    }
}


// Long Method
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 6, 8, 3};

        System.out.println("Original numeric array : "+Arrays.toString(arr));

        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++) {
            if(arr[i]==min) {
                second_min=min;
            } 
            else if (arr[i] < min) {
                second_min = min;
                min = arr[i];
            } 
            else if (arr[i] < second_min) {
                second_min = arr[i];
            }
        }

        System.out.println("Second lowest number is : " + second_min);
    }
}
