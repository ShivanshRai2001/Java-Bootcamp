public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int sum = 0;
        int count = 0;
        
        for(int i=0; i<arr.length; i++) {
            while(arr[i] != 0) {
                int lastdigit = arr[i]%10;
                count++;
                arr[i] = arr[i]/10;
            }
            if(count%2 == 0) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
