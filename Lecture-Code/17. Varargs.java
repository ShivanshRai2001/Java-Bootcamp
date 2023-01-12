import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        fun(2, 3, 45, 50);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
