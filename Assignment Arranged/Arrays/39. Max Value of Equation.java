public class Practice2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 0}, {5, 10}, {6, -10}};
        int k=1;
        int ans = Integer.MIN_VALUE;
        int i=0;
        int f=1;

        while(i<arr.length) {
            if(f<i+1) {
                f=i+1;
            }

            for(int j=f; j<=arr.length-1; j++) {
                if(arr[j][0]>(arr[i][0]+k)) {
                    break;
                }
                if((arr[i][1] + arr[j][1] + arr[j][0] - arr[i][0]) > ans) {
                    ans = arr[i][1] + arr[j][1] + arr[j][0] - arr[i][0];
                    f=j-1; 
                }
            }
            i++;
        }

        System.out.println(ans);
    }
}
