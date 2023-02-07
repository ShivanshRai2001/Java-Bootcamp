public class Practice2 {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 9, 11};
        int[] arr2 = {2, 5, 7, 9, 11};
        boolean ide = true;

        if(arr1.length == arr2.length) {
            for(int i=0; i<arr1.length; i++) {
                if(arr1[i] != arr2[i]) {
                    ide = false;
                }
            }
        }
        else {
            ide = false;
        }

        if(ide) {
            System.out.println("The two arrays are identical.");
        }
        else {
            System.out.println("The two arrays are not identical.");
        }
    }
}
