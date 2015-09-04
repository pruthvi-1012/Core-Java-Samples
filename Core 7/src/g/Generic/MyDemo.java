package g.Generic;

import java.util.ArrayList;
import java.util.List;

public class MyDemo {

	public static void main(String args[]){
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		addAll(list);
	}
	
	public static void addAll(List l){
	
		l.add("S");
	}
}
