// Integer Value
public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7, 5};
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length; j++) {
                if((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate value is : " + arr[j]);
                }
            }
        }
    }
}


// String Values
public class Practice2 {
    public static void main(String[] args) {
        String[] arr = {"abc", "def", "abc", "fds", "hry"};
        
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length; j++) {
                if((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Duplicate value is : " + arr[j]);
                }
            }
        }
    }
}
