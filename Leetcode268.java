package sortingalgorithms;

public class Leetcode268 {

    public static void main(String[] args) {
        
        Leetcode268 Object = new Leetcode268();
        
        int[] nums = {4, 2, 1, 0};
        
        int missing = Object.missingnumber(nums);
        
        System.out.println("Missing number: " + missing);  
    }
    
    public int missingnumber(int[] nums) {
        int i = 0;
        
        while (i < nums.length) {
            int current = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[current]) {
                swap(nums, i, current);
            } else {
                i++;
            }
        }
        
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }
    
    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
