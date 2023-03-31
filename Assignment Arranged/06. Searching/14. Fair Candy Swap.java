import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int[] alicesize = {1, 2};
        int[] bobsize = {2, 3};

        System.out.println(Arrays.toString(faircandyswap(alicesize, bobsize)));
    }

    static int[] faircandyswap(int[] alicesize, int[] bobsize) {
        int[] res = new int[] {0, 0};
        int alice = 0;
        int bob = 0;
        int start;
        int end;
        int mid;

        Arrays.sort(bobsize);
        
        for(int i=0; i<alicesize.length; i++) {
            alice += alicesize[i];
        }
        for(int i=0; i<bobsize.length; i++) {
            bob += bobsize[i];
        }

        for(int i=0; i<alicesize.length; ++i) {
            alice -= alicesize[i];
            bob += alicesize[i];
            start = 0;
            end = bobsize.length - 1;

            while(start <= end) {
                mid = start + (end - start) / 2;

                alice += bobsize[mid];
                bob -= bobsize[mid];

                if(alice == bob) {
                    res[0] = alicesize[i];
                    res[1] = bobsize[mid];

                    return res;
                }
                else if(alice > bob) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }

                alice -= bobsize[mid];
                bob += bobsize[mid];
            }
            alice -= bobsize[i];
            bob += bobsize[i];
        }
        return res;
    }
}
