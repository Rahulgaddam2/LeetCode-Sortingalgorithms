package sortingalgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		SelectionSort Object = new SelectionSort();
		
		int[] array = {8,3,5,62,1,4,5,7,9,6};
		
		Object.selectionsort(array);
		
		System.out.println(Arrays.toString(array));
	}
	
	public void selectionsort(int[] array) {
		
		for(int i=0;i<array.length;i++) {
			int last = array.length-i-1;
			int maxIndex = findmax(array , 0 , last);
			swap(array , maxIndex , last);
		}
	}
	public static int findmax(int[] array , int start , int end) {
		int max = start;
		
		for(int i=0;i<=end;i++) {
			if(array[max] < array[i]) {
				max = i;
			}
		}
		return max;
	}
	public void swap(int[] array , int first , int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
		
	}

}
