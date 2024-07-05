
package typecasting;

import java.util.*;

public class primitivecasting {
	public static void main(String[] args) {
		
//		String input = JOptionPane.showInputDialog("Enter Integer Value: ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		System.out.println("Input# " + input);
		
		// wrapper class
		int x = Integer.parseInt(input);
		
		// use x in calculations
	}
}
