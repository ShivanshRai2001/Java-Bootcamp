import java.util.ArrayList;
import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        String[] arr = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
        System.out.println(Arrays.toString(arr));
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
        System.out.println(list);

        list.add("HTML");
        System.out.println(list);

        // From ArrayList to Array
        list.toArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
