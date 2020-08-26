package date.time.calculator;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {
	private Calendar date;

	public DateTime(Calendar d) {
		this.date = Calendar.getInstance();
		this.date = d;
	}
	
	public DateTime() {
		this.date = Calendar.getInstance();
		
	}

	@Override
	public String toString() {
		return Calendar.DATE+" " + Calendar.MONTH + " " + Calendar.YEAR;
	}

	public Calendar getDate() {
		return date;
	}

//	public void setDate(Calendar d) {
//		 this.date = Calendar.getInstance();
//		this.date = d;
//	}
	public int getYear() {
		return (this.date.get(Calendar.YEAR));
	}
	
	public int getMonth() {
		return (this.date.get(Calendar.MONTH));
	}
	
	public int getDay() {
		return (this.date.get(Calendar.DATE));
	}
	
	public Calendar subNDays (int n) {
		date.add(Calendar.DATE, -1*n);
		return date;
	}
	
	public Calendar addNDays (int n) {
		date.add(Calendar.DATE, n);
		return date;
	}
	
	public Calendar subNMonths (int n) {
		date.add(Calendar.MONTH, -1*n);
		return date;
	}
	
	public Calendar addNMonths (int n) {
		date.add(Calendar.MONTH, n);
		return date;
	}
	
	public Calendar addNYears (int n) {
		date.add(Calendar.YEAR, n);
		return date;
	}
	
	public Calendar subNWeeks (int n) {
		return subNDays(7*n);
	}
	
	public Calendar addNWeeks (int n) {
		return addNDays(7*n);
	}
	
	public Calendar addNDateMonthYear(int a,int b,int c) {
		Calendar d = Calendar.getInstance();
		d = addNYears(c);
		d = addNMonths(b);
		d = addNDays(a);
		return d;
	}
	
	
	public int getWeekInt () {
		return (date.get(Calendar.DAY_OF_WEEK)) ;
	}
	
	public String getWeek () {
		SimpleDateFormat a  = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        return (a.format(date.getTime()));
	}
	
		
	
	
	
}
