package g.Generic;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String args[]){
		
		List l=new ArrayList();
		l.add("Abc");
		l.add(100);
		l.add('a');
		
		
		
		List<String> list=new ArrayList<String>();
		list.add("Xyz");
		list.add("Klm");
		
		
		
		List<Demo> d=new ArrayList<Demo>();
		d.add(new Demo());
		d.add(new Demo());
		d.add(new Demo());
		
	}

}

	class Demo{
		
	}
