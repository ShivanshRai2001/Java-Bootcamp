public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        int n = arr.length;
        int[] dp = new int[n];
        dp[n-1] = 0;

        for(int i=n-2; i>=0; i--) {
            if(arr[i] == 0) {
                dp[i] = Integer.MAX_VALUE;
            }

            if(arr[i] > 0) {
                int min = Integer.MAX_VALUE;
                for(int j=1; j<=arr[i]; j++) {
                    if(i+j<dp.length) {
                        if(dp[i+j] != Integer.MAX_VALUE) {
                            min = Math.min(min, dp[i+j]);
                        }
                        else {
                            dp[i] = Integer.MAX_VALUE;
                        }
                    }
                    else {
                        dp[i] = 1;
                        break;
                    }
                }

                if(min != Integer.MAX_VALUE) {
                    dp[i] = min + 1;
                }
            }
        }

        System.out.println(dp[0]!=Integer.MAX_VALUE);
    }
}
