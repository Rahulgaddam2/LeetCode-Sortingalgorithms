package sortingalgorithms;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		Bubblesort Object = new Bubblesort();
		
		int[] array = {8,3,5,62,1,4,5,7,9,6};
		
		Object.bubblesort(array);
		
	    System.out.println(Arrays.toString(array));

	}
	
	public void bubblesort(int[] array) {
		
		// run the steps n-1 times
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length-i;j++) {
				// compare - swap if the item is smaller than the previous item
				if(array[j] < array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					
				}
			}
		}
	}

}
