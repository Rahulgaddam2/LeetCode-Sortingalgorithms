package sortingalgorithms;

import java.util.Arrays;

public class LeetCode645 {

	public static void main(String[] args) {
		LeetCode645 Object = new LeetCode645();
		
		int[] nums = {1,2,2,4};
		
		int[] Final = Object.findErrorNums(nums);
		
		System.out.println(Arrays.toString(Final));
	}
	
    public int[] findErrorNums(int[] nums) {
    	int i=0;
    	
    	while(i<nums.length) {
    		if(nums[i] != i+1) {
    			int current = nums[i]-1;
    			if(nums[i] != nums[current]) {
    				swap(nums,i,current);
    			}else {
    				i++;
    			}
    		}else {
    			i++;
    		}
    	}
    	for(int index=0;index<nums.length;index++) {
    		if(nums[index] != index+1) {
    			return new int[] {nums[index] , index+1};
    		}
    	}
    	return new int[] {-1,-1};
    }
    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
