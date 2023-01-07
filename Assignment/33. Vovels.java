import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = input.nextLine();

        int len = str.length();
        String vowel = "";
        String conso = "";

        for(int i=0; i<len; i++) {
            char vol = str.charAt(i);
            if(vol == 'a' || vol == 'e' || vol == 'i' || vol == 'o' || vol == 'n' || vol == 'A' || vol == 'E' || vol == 'I' || vol == 'O' || vol == 'N') {
                vowel += vol;
            }
            else {
                conso += vol;
            }
        }
        System.out.println("The vowels are : " + vowel);
        System.out.println("The consonents are : " + conso);
    }
}
