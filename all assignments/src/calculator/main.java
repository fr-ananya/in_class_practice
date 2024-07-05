package calculator;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
	}
	
	public static void cli() {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("Enter x to terminate");
			
			System.out.println("Select Operation");
			System.out.println("+\n-\n/\n*");
			
	        String input = sc.nextLine();
	        
	        if( input == "x") {
	        	flag = false;
	        	continue;
	        }
	        
	        else {
	        	
	        	System.out.println("Enter values");
				
		        String values = sc.nextLine();
		        Integer[] values_arr = {};
		        calculate(input , values_arr);
	        }

		}
		
		
	}
	
	public static void calculate(String operation, Integer[] values) {
		
	}
}
