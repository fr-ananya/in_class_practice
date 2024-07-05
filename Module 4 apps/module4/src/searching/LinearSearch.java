package searching;

public class LinearSearch {
	public static void main(String[] args) {
		
		int[] arr =  {5,6,7,8,9};
		int ele = 9;
		
		int pos = -1;
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ele) {
				pos = i;
				break;
			}
			
		}
		if(pos!=-1)
		System.out.println("Element found at " + pos);
		else
		System.out.println("Element not found!");
		
		
	}
}
