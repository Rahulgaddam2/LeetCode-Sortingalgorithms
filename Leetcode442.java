package sortingalgorithms;

import java.util.ArrayList;
import java.util.List;

public class Leetcode442 {

    public static void main(String[] args) {
        Leetcode442 Object = new Leetcode442();
        
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        
        List<Integer> Final = Object.findDuplicates(nums);
        
        System.out.print(Final);
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int current = nums[i] - 1;
                if (nums[i] <= nums.length && nums[i] != nums[current]) {
                    swap(nums, i, current);
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                result.add(nums[index]);
            }
        }
        
        return result;
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
