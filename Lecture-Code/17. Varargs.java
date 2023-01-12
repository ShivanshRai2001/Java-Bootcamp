import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        fun(2, 3, 45, 50);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}


// For multiple variable
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        multiple(2, 3, "Kunal", "Rahul");
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
