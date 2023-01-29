public class Practice2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 5}, {7, 3}, {3, 5}};

        int rlen = arr.length;
        int clen = arr[0].length;
        int max = 0;
        int sum;

        for(int i=0; i<rlen; i++) {
            sum = 0;
            for(int j=0; j<clen; j++) {
                sum += arr[i][j];
            }
            if(sum > max) {
                max = sum;
            }
        }
        
        System.out.println(max);
    }
}
