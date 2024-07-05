
package module4;

public class MyDate {
	
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public String formateMyDate() {
		return day + "/" + month+ "/" + year;
	}
	public void setDay(int day) {
		this.day = day;
	}

}


