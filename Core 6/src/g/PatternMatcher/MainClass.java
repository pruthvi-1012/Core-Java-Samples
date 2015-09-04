package g.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
	
	public static void main(String args[]){
		
		/*Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abaaab");
		
		while(m.find()){
			System.out.println(m.start());
		}*/
		
		Pattern p1=Pattern.compile("aba");
		Matcher m1=p1.matcher("abababa");
		while(m1.find()){
			
			System.out.println(m1.start());
		}
		
	}

}
