package sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge (int[] array , int left , int mid  , int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		for ( int i = 0 ; i < n1 ; i++) {
			leftArray[i] = array[left + i];
		}
		
		for ( int j = 0 ; j < n2  ; j++) {
			rightArray[j] = array[mid+1+j];
		}
		
//		System.out.println("Left Array : " + Arrays.toString(leftArray));
//		System.out.println("Right Array : " + Arrays.toString(rightArray));
		int k = left;
		int i = 0 , j = 0;
		while ( i < n1 && j < n2 ) {
			if ( leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while ( i < n1 ) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
		while ( j < n2 ) {
			array[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
	
	public static void mergeSort(int[] array, int left, int right) {
		if ( left < right ) {
			int mid = left + ( right - left ) / 2 ;
//			System.out.println("middle: " + mid);
			
			//sort first and second halves
			mergeSort(array, left, mid);
			mergeSort(array, mid+1, right);
			
			merge(array, left, mid, right);
		}
		
		

	}
	
	public static void main(String[] args) {
		int[] array = {12,11,13,5,6,7};
		
		System.out.println("Unsorted Array");
		System.out.println(Arrays.toString(array));
		
		mergeSort(array, 0, array.length -1);
		System.out.println("sorted Array");
		System.out.println(Arrays.toString(array));
		
	}

}
