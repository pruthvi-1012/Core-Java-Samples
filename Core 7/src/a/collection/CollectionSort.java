package a.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
	
	public static void main(String args[]){
		
		List l=new ArrayList();
		l.add(123);
		l.add(90);
		l.add(10);
		l.add(50);
		
		Collections.sort(l);
		
		System.out.println(l);
	}

}
