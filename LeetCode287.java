package sortingalgorithms;

import java.util.List;

import java.util.Arrays;

public class LeetCode287 {

	public static void main(String[] args) {
		LeetCode287 Object = new LeetCode287();
        
        int[] nums = {1,4,8,4};
        
      int duplicate = Object.findDuplicate(nums);
       
       System.out.print(duplicate);

	}
	public int findDuplicate(int[] nums) {
		int i=0;
		
		while(i<nums.length) {
			if(nums[i] != i+1) {
				int current = nums[i]-1;
				if(nums[i] != nums[current]) {
					swap(nums , i , current);
				}else {
					return nums[i];
				}
			}else {
				i++;
			}
		}
		return -1;
	}
	public void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
