package sortingalgorithms;

import java.util.Arrays;

public class Cyclesort {

	public static void main(String[] args) {
		Cyclesort Object = new Cyclesort();
		
		int[] array = {1,2,0,3,7,6,5,4};
		
		Object.cyclesort(array);
		
	    System.out.println(Arrays.toString(array));
		

	}
	public void cyclesort(int[] array) {
		int i=0;
		
		while(i < array.length) {
			int current = array[i] ;
			if(array[i] != array[current]) {
				swap(array , i , current);
			}else {
				i++;
			}
		}
		
	} 
	public void swap(int[] array , int first ,  int second) {
		int temp = array[first];
		array[first] = array[second];
		array[second] = temp;
	}

}
