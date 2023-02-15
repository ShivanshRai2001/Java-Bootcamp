public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 3, 3};
        int counteven = 0;
        int countodd = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                counteven++;
            }
            else {
                countodd++;
            }
        }

        System.out.println(Math.min(countodd, counteven));
    }
}
