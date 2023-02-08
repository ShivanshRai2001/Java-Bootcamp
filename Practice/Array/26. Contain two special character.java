public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 4, 9, 0, -1};
        boolean status = false;

        for(int i=0; i<arr.length; i++) {
            if((arr[i] == 0) || (arr[i] == -1)) {
                status = true;
            }
        }

        if(status) {
            System.out.println("Array has 0 and -1.");
        }
        else {
            System.out.println("Array does not have 0 and -1.");
        }
    }
}
