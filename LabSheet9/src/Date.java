
public class Date {
	private int year;
	private int month;
	private int day;
	
	Date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear(int year) {
		return this.year;
	}
	public int getMonth(int month) {
		return this.month;
	}
	public int getDay(int day) {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day  = day;
	}
	public String toString() {
		return String.format("%02d/%02d/%02d",month,day,year);
	}
	
	public void setDate(int year,int month,int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
