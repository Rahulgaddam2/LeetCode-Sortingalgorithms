package sortingalgorithms;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		Insertionsort Object = new Insertionsort();
		
		int[] array = {8,3,5,62,1,4,5,7,9,6};
		
		Object.insertionsort(array);
		
	    System.out.println(Arrays.toString(array));

	}
	public void insertionsort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(array[j] < array[j-1]) {
					swap(array, j , j-1);
				}else {
					break;
				}
			}
		}
	}
	
	public void swap(int[] array , int first ,  int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

}
