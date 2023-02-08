public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        System.out.println("Original length : " + arr.length);

        int index = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                arr[index++] = arr[i];
            }
        }

        System.out.println("After duplication removal : " + index);
    }
}
