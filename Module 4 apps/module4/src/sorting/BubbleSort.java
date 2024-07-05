package sorting;

public class BubbleSort {


	public static void main(String[] args) {
		int[] array = {100,9,20,3,40,54};
		for(int ele: array) {
			System.out.print(" " + ele);}
		System.out.println();
		
		BubbleSort(array);
		
		for(int ele: array) {
			System.out.print(" " + ele);}
		
		System.out.println();
		
	}

	
	public static void BubbleSort(int[] array) {
		int n = array.length;
		
		boolean swapped;
	    for (int i = 0; i < n - 1; i++) {
	        swapped = false;
	        for (int j = 0; j < n - 1 - i; j++) {
	            if (array[j] > array[j + 1]) {
//	            	System.out.println( "BEFORE j: "+ j + " array[j]: " + array[j] + " arrary[j+1]: " + array[j+1]);
	                // Swap array[j] and array[j + 1]
	                int temp = array[j];
	                array[j] = array[j + 1];
	                array[j + 1] = temp;
	                swapped = true;
	                
//	                System.out.println( "after j: "+ j + " array[j]: " + array[j] + " arrary[j+1]: " + array[j+1]);
//	                
//	                for(int ele: array) {
//	        			System.out.print(" " + ele);}
//	        		
//	        		System.out.println();
	            }
	        }
//	        for(int ele: array) {
//				System.out.print(" " + ele);}
//			
//			System.out.println();
	        // If no elements were swapped, the array is already sorted
	        if (!swapped) break;
	    }
		
	}

}