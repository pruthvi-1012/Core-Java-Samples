package e.date;

import java.util.Calendar;
import java.util.Date;

public class MainClass {
	
	public static void main(String args[]){
		
		
		//Date Class
		
	/*	Date d=new Date();
		System.out.println(d.toString());
		
		Date d2=new Date("10/11/2009");
		System.out.println(d.after(d2));
		System.out.println(d.before(d2));
		System.out.println(d.compareTo(d2));
		System.out.println("Date=="+d.getDate());
		System.out.println("Day=="+d.getDay());
		System.out.println("Hour=="+d.getHours());
		System.out.println("Minute=="+d.getMinutes());
		System.out.println("Seconds=="+d.getSeconds());*/
				
		//Calendar Class
		
		Calendar c=Calendar.getInstance();
		c.setTime(new Date());
		
		// Months
		 
		/*System.out.println("January "+c.JANUARY);
		System.out.println("February "+c.FEBRUARY);
		
		// Days
		System.out.println("Monday "+c.MONDAY);
		System.out.println("Tuesday "+c.TUESDAY);
		
		// Extra Features
		System.out.println("AM="+c.AM);
		System.out.println("PM="+c.PM);
		System.out.println("AM_PM="+c.AM_PM);*/
		
		
		//Add months and Days to Date
		
		
		c.add(Calendar.DATE,20);
		System.out.println(c.getTime());
		/*c.roll(Calendar.DATE,20);
		System.out.println(c.getTime());*/
		
			
		
	}

}
