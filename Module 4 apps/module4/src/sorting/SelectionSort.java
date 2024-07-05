package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {100,9,20,3,40,54};
		for(int ele: array) {
			System.out.print(" " + ele);}
		System.out.println();
		
		SelectionSort(array);
		
		for(int ele: array) {
			System.out.print(" " + ele);}
		
		System.out.println();
		
	}

	public static void SelectionSort(int[] array) {
		
		for(int i=0 ; i<array.length ; i++) {
			int minIndex = i;
			for(int j=i+1 ; j<array.length ; j++) {
				if(array[j] < array[minIndex]) {
					minIndex = j;
//					System.out.println(" i: " + i + " j: "+ j + " minIndex: " + minIndex + " arrary[minIndex]: " + array[minIndex]);
				}
			}
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
//			for(int ele: array) {
//				System.out.print(" " + ele);}
//			
//			System.out.println();
		}
		
	}

}