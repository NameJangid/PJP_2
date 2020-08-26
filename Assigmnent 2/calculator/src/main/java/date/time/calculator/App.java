package date.time.calculator;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	int[] d1 = {24,8,2020};
//    	Calendar d = Calendar.getInstance();
//    	System.out.print(d);
//    	d.set(d1[2], d1[1]-1, d1[0]);
//	    int[] d2 = {26,8,2020};
//	   	Calendar d_2 = Calendar.getInstance();
//	   	d_2.set(d2[2], d2[1]-1, d2[0]);
//        DateTime a = new DateTime(d);
//        DateTime b = new DateTime(d_2);
//        DateTimeEvaluator c = new DateTimeEvaluator(a,b);
        
//    	System.out.print(c.subDates());
    	
    	while(true) {
    		
    		
    		System.out.println("1 - Add 'n' Days");
    		System.out.println("2 - Sub 'n' Days");
    		System.out.println("3 - Day of the Week for a given date");
    		System.out.println("4 - Week number for a given a date");
    		System.out.println("5 - Add two dates");
    		System.out.println("6 - Sub two dates");
    		System.out.println("7 - NLP"); 		
       		System.out.println("8 - Close the file");
    		System.out.println("Enter the No. you want to choose :");
    		
    		
    		
    		@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
    		int inputOption = scan.nextInt();
    		
    		if(inputOption == 1) {
    			
    			System.out.print("Enter the date  DD-MM-YYYY format ");
    			String date1 = scan.next();
    			System.out.print("Enter the N days");
    			String N = scan.next();
    			
    	    	
    			int day = Integer.parseInt(date1.substring(0,2));
    			int month = Integer.parseInt(date1.substring(3,5));
    			int year = Integer.parseInt(date1.substring(6,10));
    			int n = Integer.parseInt(N);
    			
    			Calendar d = Calendar.getInstance();
    	    	System.out.print(d);
    	    	d.set(year, month-1, day);

    	    	DateTime a = new DateTime(d);
    			a.addNDays(n);
    	    	
   
    			System.out.println("New Date : " + a);
    			
    			
    		}
    		else if(inputOption == 2) {
    			
    			System.out.print("Enter the date  DD-MM-YYYY format ");
    			String date1 = scan.next();
    			System.out.print("Enter the N days");
    			String N = scan.next();
    			
    	    	
    			int day = Integer.parseInt(date1.substring(0,2));
    			int month = Integer.parseInt(date1.substring(3,5));
    			int year = Integer.parseInt(date1.substring(6,10));
    			int n = Integer.parseInt(N);
    			
    			Calendar d = Calendar.getInstance();
    	    	System.out.print(d);
    	    	d.set(year, month-1, day);

    	    	DateTime a = new DateTime(d);
    			a.subNDays(n);
    	    	
   
    			System.out.println("New Date : " + a);
    			
    			
    		}
    		else if(inputOption == 3) {
    			
    			System.out.print("Enter the date  DD-MM-YYYY format ");
    			String date1 = scan.next();

    			
    	    	
    			int day = Integer.parseInt(date1.substring(0,2));
    			int month = Integer.parseInt(date1.substring(3,5));
    			int year = Integer.parseInt(date1.substring(6,10));
    			
    			
    			Calendar d = Calendar.getInstance();
    	    	System.out.print(d);
    	    	d.set(year, month-1, day);

    	    	DateTime a = new DateTime(d);
    			
    	    	
   
    			System.out.println("Week Day is : " + a.getWeek());
    			
    			
    		}
    		else if(inputOption == 4) {
    			
    			System.out.print("Enter the date  DD-MM-YYYY format ");
    			String date1 = scan.next();

    			
    	    	
    			int day = Integer.parseInt(date1.substring(0,2));
    			int month = Integer.parseInt(date1.substring(3,5));
    			int year = Integer.parseInt(date1.substring(6,10));
    			
    			
    			Calendar d = Calendar.getInstance();
    	    	System.out.print(d);
    	    	d.set(year, month-1, day);

    	    	DateTime a = new DateTime(d);
    			
    	    	
   
    			System.out.println("Week No is : " + a.getWeekInt());
    			
    			
    		}
    		else if(inputOption == 5) {
    			
    			System.out.print("Enter the date  DD-MM-YYYY format ");
    			String date1 = scan.next();

    			
    	    	
    			int day = Integer.parseInt(date1.substring(0,2));
    			int month = Integer.parseInt(date1.substring(3,5));
    			int year = Integer.parseInt(date1.substring(6,10));
    			
    			Calendar d1 = Calendar.getInstance();
    	    	System.out.print(d1);
    	    	d1.set(year, month-1, day);
    	    	
    			System.out.print("Enter the date  DD-MM-YYYY format ");
    			String date2 = scan.next();
    	    	
    			day = Integer.parseInt(date2.substring(0,2));
    			month = Integer.parseInt(date2.substring(3,5));
    			year = Integer.parseInt(date2.substring(6,10));
    			
    			Calendar d2 = Calendar.getInstance();
    	    	System.out.print(d2);
    	    	d2.set(year, month-1, day);

    	    	DateTime a = new DateTime(d1);
    	    	DateTime b = new DateTime(d2);
    	    	
    	        DateTimeEvaluator c = new DateTimeEvaluator(a,b);
    	        
    	    	System.out.print("New Date is : " + c.addDates());
    	    	
      			
    			
    		}
    		else if(inputOption == 6) {
    			
    			System.out.print("Enter the date  DD-MM-YYYY format ");
    			String date1 = scan.next();

    			
    	    	
    			int day = Integer.parseInt(date1.substring(0,2));
    			int month = Integer.parseInt(date1.substring(3,5));
    			int year = Integer.parseInt(date1.substring(6,10));
    			
    			Calendar d1 = Calendar.getInstance();
    	    	System.out.print(d1);
    	    	d1.set(year, month-1, day);
    	    	
    			System.out.print("Enter the date  DD-MM-YYYY format ");
    			String date2 = scan.next();
    	    	
    			day = Integer.parseInt(date2.substring(0,2));
    			month = Integer.parseInt(date2.substring(3,5));
    			year = Integer.parseInt(date2.substring(6,10));
    			
    			Calendar d2 = Calendar.getInstance();
    	    	System.out.print(d2);
    	    	d2.set(year, month-1, day);

    	    	DateTime a = new DateTime(d1);
    	    	DateTime b = new DateTime(d2);
    	    	
    	        DateTimeEvaluator c = new DateTimeEvaluator(a,b);
    	        
    	    	System.out.print("New Date is : " + c.subDates());
    	    	
      			
    			
    		}
    		
    		else if(inputOption == 7) {
    			
    			System.out.println("Enter the NLP statement :");
    			@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
    	        String statement = sc.nextLine();

    	       
    	        DateTime a = new DateTime();
    	        
    	        
    			if(statement.equals("today")) {
    				System.out.println(a);
    			}		
    			else if(statement.equals("tomorrow")) {
    				System.out.println(a.addNDays(1));
    			}
    			else if(statement.equals("day after tomorrow")) {
    				System.out.println(a.addNDays(2));
    			}
    			else if(statement.equals("yesterday")) {
    				System.out.println(a.subNDays(1));    				
    			}
    			else if(statement.equals("day before yesterday")) {
    				System.out.println(a.subNDays(2));   				
    			}
    			else if(statement.equals("last week")) {
    				System.out.println(a.subNWeeks(1));
    			}
    			else if(statement.equals("previous week")) {
    				System.out.println(a.subNWeeks(1));    				
    			}   			
    			else if(statement.equals("next week")) {
    				System.out.println(a.addNWeeks(1));
    			}
    			else if(statement.equals("next month")) {
    				System.out.println(a.addNMonths(1));
    			}
    			else if(statement.equals("next year")) {
    				System.out.println(a.addNYears(1));
    			}
    			else if(statement.equals("last month")){
    				System.out.println(a.subNMonths(1));
    			}
    			else if(statement.equals("last year")) {
    				System.out.println(a.subNMonths(12));
    			}

    			else if(statement.equals("days from now")) {
    				System.out.println("specify no.?");
    				int n = scan.nextInt();
    				System.out.println(a.addNDays(n));
    			}
    			else if(statement.equals("months from now")) {
    				System.out.println("specify no.?");
    				int n = scan.nextInt();
    				System.out.println(a.addNMonths(n));
    			}
    			else if(statement.equals("years from now")) {
    				System.out.println("specify no.?");
    				int n = scan.nextInt();
    				System.out.println(a.addNYears(n));
    			}
    				
    		}
    		else if(inputOption == 8) {
    			System.out.println("Closing the Calculator");
    			System.exit(1);
    		}
    	}
    }
}
