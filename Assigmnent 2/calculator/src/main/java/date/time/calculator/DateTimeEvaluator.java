package date.time.calculator;

import java.util.ArrayList;

public class DateTimeEvaluator {
	private DateTime a;
	private DateTime b;
	

	public DateTimeEvaluator(DateTime a, DateTime b) {
		super();
		this.a = a;
		this.b = b;
	}
	public ArrayList<Integer> addDates() {
		 DateTime c = new DateTime(this.a.addNDateMonthYear(this.b.getDay(), this.b.getMonth(), this.b.getYear()));
		 ArrayList<Integer> arrli 
         = new ArrayList<Integer>(3);
		 arrli.add(c.getDay());
		 arrli.add(c.getMonth());
		 arrli.add(c.getYear());
		 return arrli;
		 
	}
	static int countLeapYears(DateTime d)  { 
		int years = d.getYear(); 
		if (d.getYear() <= 2) years--;
		return years / 4 - years / 100 + years / 400; 
	} 
	
	public int subDates() {
		 int x=0,y=0;
		 int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 for(int i=0;i<this.a.getMonth()-1;i++) {
			 	x = x+monthDays[i];
		 }
		 for(int i=0;i<this.b.getMonth()-1;i++) {
			 	y = y+monthDays[i];
		 }
		 
		 x  = x + this.a.getDay()+this.a.getYear()*365;
		 y  = y + this.b.getDay()+this.b.getYear()*365;
		 

		 x = x + countLeapYears(this.a);
		 y = y + countLeapYears(this.b);
		 if(x>y) {
			 return x-y;
		 }
		 
		 return y-x;
		
		 
	}
	

}
