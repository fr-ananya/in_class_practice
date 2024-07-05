
package module4;

public class TestMyDate {

	public static void main(String[] args) {
	
		MyDate date = new MyDate(1, 1, 2020);
		
		changeMyDate(date);
		
		System.out.println(date.formateMyDate());
		
		changeMyDateAttributes(date);
		
		System.out.println(date.formateMyDate());

	}

	private static void changeMyDateAttributes(MyDate date) {
	
		date.setDay(2);
		return;
		
	}

	private static void changeMyDate(MyDate date) {
		//call be value
		date = new MyDate(2, 2, 2024);
		return;
	}

}