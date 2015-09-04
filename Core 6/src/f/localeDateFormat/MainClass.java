package f.localeDateFormat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainClass {
	
	public static void main(String args[]){
		
		
		// Locale For Date Class
		
	/*	Locale l=new Locale(Locale.FRENCH.getLanguage());
		Date d=new Date();
		DateFormat df=DateFormat.getDateInstance(DateFormat.FULL, l);
		String s=df.format(d);
		System.out.println(s);*/
		
		
		
		// Locale For NumberFormat Class
		
		
		int i=98763554;
		Locale loc=new Locale(Locale.ENGLISH.toString(),Locale.US.toString());
		NumberFormat nf=NumberFormat.getInstance(loc);
		System.out.println(nf.format(i));
		
		//DateFormat Class
		
	/*	Date d=new Date();
		DateFormat df1=DateFormat.getDateInstance(DateFormat.SHORT);
		DateFormat df2=DateFormat.getDateInstance(DateFormat.MEDIUM);
		DateFormat df3=DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat df4=DateFormat.getDateInstance(DateFormat.FULL);
		
		System.out.println(df1.format(d));
		System.out.println(df2.format(d));
		System.out.println(df3.format(d));
		System.out.println(df4.format(d));*/
		
	}

}
