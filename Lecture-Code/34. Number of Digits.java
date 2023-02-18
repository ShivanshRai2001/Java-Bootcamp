public class Practice2 {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896};

        System.out.println(findNumber(num));
        System.out.println(digits(54637));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for(int num:nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numberofdigits = digits(num);
        // if(numberofdigits % 2 == 0) {
        //     return true;
        // }

        // return false;
        return numberofdigits % 2 == 0;
    }

    static int digits(int num) {
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while(num>0) {
            count++;
            num = num/10;
        }
        return count;
    }
}
