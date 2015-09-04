package g.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {
	
	public static void main(String args[]){
		
		
		/*Pattern p=Pattern.compile("\\w");
		Matcher m=p.matcher("7 6 abcfd _a");
		
		while(m.find()){
			
			System.out.println(m.start());
			
		}*/
		
		
		Pattern p1=Pattern.compile("[a-hA-H]");
		Matcher m1=p1.matcher("112@$hijk$^313$^F$^B4554d");
		
		while(m1.find()){
			
			System.out.println(m1.start());
		}
		
	/*	
		Pattern p2=Pattern.compile("([0-9]+)-([0-9]+)");
		Matcher m2=p2.matcher("abcd079-29292929 jhfg");
	
		while(m2.find()){
			
			System.out.println(m2.start()+"   "+m2.group());
		}*/
		
		/*Pattern p3=Pattern.compile("\\d+");
		Matcher m3=p3.matcher("as12 3bc fff");
		
		System.out.println("Start   Group");
		while(m3.find()){
		
			System.out.println(m3.start()+"       "+m3.group());
		}*/
		
		
		
	}

}
