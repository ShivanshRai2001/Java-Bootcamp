public class Practice2 {
    public static void main(String[] args) {
        String name = "Superman";
        char target = 'm';

        System.out.println(search1(name, target));
    }

    static boolean search(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == target) {
                return true;
            }
        }

        return false;
    }

    // Another way to use for each loop
    static boolean search1(String str, char target) {
        if(str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }

        return false;
    }
}
