package sortingalgorithms;

import java.util.*;

public class Leetcode448 {

	public static void main(String[] args) {
		
		Leetcode448 Object = new Leetcode448();
        
        int[] nums = {1,4,8};
        
        List<Integer> missing = Object.findDisappearedNumbers(nums);
        
        System.out.println("Missing number: " + missing);  
		

	}
	public List<Integer> findDisappearedNumbers(int[] nums){
		List<Integer> result = new ArrayList<>();
		int i=0;
		
		while(i<nums.length) {
			int current = nums[i]-1;
			if(nums[i] <= nums.length && nums[i] != nums[current]) {
				swap(nums , i , current);
			}else {
				i++;
			}
		}
		for(int index=0;index<nums.length;index++) {
			if(nums[index] != index+1) {
				result.add(index+1);
			}
		}
		
		return result;
	}
	public void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
