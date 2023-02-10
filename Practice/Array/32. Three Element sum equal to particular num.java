import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = {1, -2, 0, 5, -1, -4};

        System.out.print("Enter the target value : ");
        int target = input.nextInt();

        // ArrayList<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length ;j++){
                for(int k = j; k<nums.length;k++){
                    if ( i != j && j != k && i != k && (nums[i] + nums[j] + nums[k] == target)){
                        List<Integer> inner_List = new ArrayList<Integer>(3);
                        inner_List.add(nums[i]);
                        inner_List.add(nums[j]);
                        inner_List.add(nums[k]);
                        list.add(inner_List);
                    }
                }
            }
        }

        System.out.println("The elements are : " + list);
    }
}
