public class Practice2 {
    public static void main(String[] args) {
        int[] num = {20, 20, 30, 40, 50, 50, 50};
        int index = 1;

        for(int i=0; i<num.length; i++) {
            if(num[i] != num[index-1]) {
                num[index++] = num[i];
            }
        }

        System.out.println(index);
    }
}
