//package workingWithStrings;
//
//import java.util.Iterator;
//
//public class StringExamples {
//	
//	public static void main(String[] args) {
//		int iterations = 10000;
//		
//		// use String
//		long startTime = System.currentTimeMillis();
//		String str  = "Hello";
//		for(int i = 0 ; i < iterations ; i++) {
//			str += " World";
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("Time taken by String: " + (endTime-startTime) + "ms");
//	
//		
//		startTime = System.currentTimeMillis();
//		//use StringBuffer
//		StringBuffer stringBuffer = new StringBuffer("Hello ");
//		for(int i = 0 ; i < iterations ; i++) {
//			stringBuffer.append(" world");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("Time taken by StringBuffer: " + (endTime-startTime) + "ms");
//	
//		
//		startTime = System.currentTimeMillis();
//		//use StringBuffer
//		StringBuilder stringBuilder = new StringBuilder("Hello ");
//		for(int i = 0 ; i < iterations ; i++) {
//			stringBuilder.append(" world");
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("Time taken by StringBuilder: " + (endTime-startTime) + "ms");
//	
//	}
//
//}
//
