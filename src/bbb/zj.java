package bbb;

import java.util.ArrayList;
import java.util.List;

public class zj {


    public static void main(String[] args) {
         int[] arr={1,3,5,7};
        subsets(arr);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        results.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> plusNumbers = new ArrayList<>();
            for (List<Integer> result : results) {
                List<Integer> newNumber = new ArrayList<>(result);
                newNumber.add(nums[i]);
                plusNumbers.add(newNumber);
                System.out.println(i);
            }
            results.addAll(plusNumbers);
        }
        return results;
    }
}
