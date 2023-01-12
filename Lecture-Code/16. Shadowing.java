public class Practice2 {
    static int x = 90;  // this will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x);  // 90
        int x = 20;     // the class variable at line 2 is shadowed by this

        /*
        int x;
        System.out.println(x);  // scope will begin when value is initialised
        x = 20;
        */

        System.out.println(x);  // 20
        fun();
    }

    static void fun() {
        System.out.println(x); // 90
    }
}
