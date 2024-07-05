package assignmentArrays;

public class workingWithArray {
	
	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
//		arr[0]= 1;
		
		//intialize 10 elements
		for(int i=0; i<10; i++) {
			arr[9-i] = i*10;
		}
		
		System.out.print("Original Array: ");
		for (int num : arr) {
		    System.out.print(num + " ");
		}
		System.out.println();
		
//		finding minimum number
		int minValue= findMinimum(arr);	
		
//		finding maximum number
		int maxValue= findMaximum(arr);
		
//		finding average
		int avg= findAverage(arr);
		
//		finding element
		int index= search(arr, 20);
		
//		sorting array
		sort(arr);
		
//		2 dimensional
		
		int[][] twoDim = new int[3][3];
		
		int elements = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				twoDim[i][j] = elements;
				elements++;
			}
		}
		
//		sum
		int twoDimSum= twoDimSum(twoDim);
		
		
		System.out.println("Minimum Value: " + minValue);
		System.out.println("Maximum Value: " + maxValue);
		System.out.println("Average: " + avg);
		System.out.println("Index of element 20: " + index);
		System.out.print("Sorted Array: ");
		for (int num : arr) {
		    System.out.print(num + " ");
		}
		System.out.println();

		System.out.println("--------------");
		System.out.println("Original 2-dimensional array:");
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        System.out.print(twoDim[i][j] + " ");
		    }
		    System.out.println();
		}
		System.out.println("Sum of 2-dimensional array: " + twoDimSum);
		
		
		
		transpose(twoDim);
		System.out.println("Transposed 2-dimensional array:");
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        System.out.print(twoDim[i][j] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("Sum of row elements: ");
		twoDimRowSum(twoDim);
		
		System.out.println("Sum of col elements: ");
		twoDimColSum(twoDim);
		
//		transpose(twoDim);
		
		
		
	
		
	}
	
	public static int findMinimum(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<10; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	
	
	public static int findMaximum(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		for(int i=0; i<10; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public static int findAverage(int[] arr) {
		
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			sum += arr[i];
		}
		
		return sum/arr.length;
	}
	
	public static int search(int[] arr, int element) {
		
		int index = 0;
		
		for(int i=0; i<10; i++) {
			if(arr[i] == element) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public static void sort(int[] arr) {
		
		boolean flag = true;
		
	    while (flag) {
	        flag = false;  // Assume no swaps will happen
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                // Swap elements
	                int temp = arr[i];
	                arr[i] = arr[i + 1];
	                arr[i + 1] = temp;
	                flag = true;  // A swap happened, so we need to check again
	            }
	        }
	    }
		
		
	}
	

	public static int twoDimSum(int[][] twoDimArray) {
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum += twoDimArray[i][j];
			}
		}
		
		return sum;
	}
	
	public static void twoDimRowSum(int[][] twoDimArray) {
		
		int row = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				row += twoDimArray[i][j];
			}
			System.out.println(row);
			row=0;
		}
	}
	
	public static void twoDimColSum(int[][] twoDimArray) {
		
		int col = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				col += twoDimArray[j][i];
			}
			System.out.print(col+" ");
			col=0;
		}
	}
	
	public static int transpose(int[][] twoDimArray) {
		
		int sum = 0;
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				int temp = twoDimArray[i][j];
				twoDimArray[i][j] = twoDimArray[j][i];
				twoDimArray[j][i] = temp;
				
			}
		}
		
		return sum;
	}
	
	public static int multiply(int[][] arr1, int[][] arr2) {
		
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				
			}
		}
		
		return sum;
	}
	

	

}


//SingleDimensionArray :
//
//create an array of integers
//
//1. intialize 10 elements
//2. maximum and minimum element in array
//3. calculate average 
//4. search
//5. sort -- asc
//
//
//
//MultiDimensional ( matrix )
//
//3 * 3
//sum
//
//sum of each , sum of each col
//transpose ( swap rows with  colums)
//2 3*3 and perform  multiply