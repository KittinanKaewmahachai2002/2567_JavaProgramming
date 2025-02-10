
public class Date {
	private int dMonth,dDay,dYear; 
	
	Date(){
		dMonth = 0;
		dDay = 0;
		dYear = 0;
	}
	Date(int month,int day,int year){
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	public void setDate(int month,int day ,int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dDay;
	}
	public int getYear() {
		return dYear;
	}
	public String toString() {
		return getMonth()+"-"+getDay()+"-"+getYear();
	}
}
