public class Practice2 {
    public static void main(String[] args) {
        int[] arr1 = {7, 8, 5, 6, 4};
        int[] arr2 = {9, 5, 0, 7, 3};

        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.println("Duplicate term is : " + arr1[i]);
                }
            }
        }
    }
}
