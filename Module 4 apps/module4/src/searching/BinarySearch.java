package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		int target = 30;
		
		int index = binarySearch(array,target);
		
		
		if ( index != -1 ) {
			System.out.println("Element " + target + " found at index" + index);
		}else {
			System.out.println("Element " + target + "not found in the arrray");
		}
	}

	private static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length -1;
		
		while(left <=right) {
			int mid = left+ (right-left)/2;
			if( array[mid] == target) {
				return mid;
			}
			else if( array[mid] > target) {
				right = mid-1; 
			}else {
				left = mid+1;
			}
		}
		
		return -1;
	}

}