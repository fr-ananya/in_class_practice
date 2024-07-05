package searching;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExponentialSearch {
    
    public static int exponentialSearch(int[] array, int target) {
//        int n = arr.length;
//        
//        if (n == 0) {
//            return -1;
//        }
//        
//        if (arr[0] == target) {
//            return 0;
//        }
//        
//        int i = 1;
//        
//        while (i < n && arr[i] <= target) {
//            i *= 2;
//        }
//        
//        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), target);
    	
    	
    	if(array.length==0) {
    		return -1;
    	}
    	if(array[0] == target) {
    		return 0;
    	}
//    	find the range for binary search by repeated doubling
    	
    	int i = 1;
    	while(i < array.length && array[i]<target) {
    		i*= 2;
    	}
    	
    	return binarySearch(array , i/2 , Math.max( i , array.length -1) , target );
    	
    	
    }
    
    public static int binarySearch(int[] array , int startIndex , int endIndex , int target) {
    	
    	int left = startIndex;
		int right =  endIndex  ;
		
		
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

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40, 50, 70, 80};
        int target = 10;
        int result = exponentialSearch(arr, target);
        
        if (result >= 0) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
