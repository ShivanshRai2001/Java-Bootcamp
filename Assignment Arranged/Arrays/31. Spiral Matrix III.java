import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int row = 5;
        int col = 6;
        int rstart = 1;
        int cstart = 4;

        int direction[] = {0, 1, 0, -1, 0};

        int steps = 0;
        int move = 0;
        int count = 0;
        int ans[][] = new int[row*col][2];
        ans[count][0] = rstart;
        ans[count][1] = cstart;
        count++;

        int rows = rstart;
        int cols = cstart;

        while(count<row*col) {
            if(move==0 || move==2) {
                steps++;
            }

            for(int i=0; i<steps; i++) {
                rows += direction[move];
                cols += direction[move+1];

                if(rows<row && rows>=0 && cols<col && cols>=0) {
                    ans[count][0] = rows;
                    ans[count][1] = cols;
                    count++;
                }
            }

            if(move!=0) {
                move = (move+1)%4;
            }
            else {
                move++;
            }
        }

        System.out.println(Arrays.deepToString(ans));
    }
}
