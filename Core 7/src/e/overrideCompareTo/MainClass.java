package e.overrideCompareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass  {
	
	public static void main(String args[]){
		
		List<Title> l=new ArrayList<Title>();
		
		l.add(new Title("X"));
		l.add(new Title("D"));
		l.add(new Title("A"));
		l.add(new Title("Z"));
		Collections.sort(l);
		
		for(Object o:l){
			
			System.out.println(((Title)o).toString());
		}
	}
	
	

}

	class Title implements Comparable<Title>{
		
		String t;
		
		 Title(){
			
		}
		 
		Title(String t){
			
			this.t=t;
			
		}

		public String getT() {
			return t;
		}

		public void setT(String t) {
			this.t = t;
		}

		@Override
		public int compareTo(Title o) {
			// TODO Auto-generated method stub
			return t.compareTo(o.getT());
		}

		public String toString(){
			
			return "title:"+t;
		}
		
	}
