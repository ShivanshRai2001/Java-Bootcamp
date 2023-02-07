public class Practice2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        int tot = 7;

        int exp = tot * ((tot + 1) / 2);
        int num = 0;

        for(int i: arr) {
            num += i;
        }

        System.out.println(exp - num);
    }
}
