package sorting;

public class InsertionSort {


	public static void main(String[] args) {
		int[] array = {100,9,20,3,40,54};
		for(int ele: array) {
			System.out.print(" " + ele);}
		System.out.println();
		
		InsertionSort(array);
		
		for(int ele: array) {
			System.out.print(" " + ele);}
		
		System.out.println();
		
	}

	
	public static void InsertionSort(int[] array) {
		int n = array.length;
		for ( int i = 1; i < n ;i++) {
//			System.out.println("i -- " + i);
//			for(int ele: array) {
//				System.out.print(" " + ele);}
//			
//			System.out.println();
			
			int key = array[i];
			int j = i - 1 ;
			
			while ( j >= 0 && array[j] > key ) {
				
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
			
//			for(int ele: array) {
//				System.out.print(" " + ele);}
//			System.out.println();
//			
//			System.out.println("i after " + i);
			
		}
	}

}