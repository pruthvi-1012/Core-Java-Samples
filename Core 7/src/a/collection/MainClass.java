package a.collection;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
	
	public static void main(String args[]){
		
		
		// ArrayList
		
	/*	List l=new ArrayList();
		l.add(100);
		l.add("Kush");
		l.add('A');
		l.add(890.398);
		l.add(0,"Start-0");
		l.contains('A');
		
		for(Object a:l){
			
			System.out.println(a);
		}*/
		
		
		// LinkedList
		
		/*List l=new LinkedList();
		l.add(100);
		l.add("Kush");
		l.add('A');
		l.add(890.398);
		l.add(0,"Start-0");*/
		
		
		// HashSet
		
		Set l =new HashSet();
		
		
		l.add("xyz");
		l.add("Kush");
		l.add('A');
		l.add("Kush");
	
		System.out.println("SIZE=="+l.size());
		for(Object o:l){
			System.out.println(o);
		}
		
		
		// LinkedHashSet
		
		/*Set l =new LinkedHashSet();
		l.add(100);
		l.add("Kush");
		l.add('A');
		l.add(890.398);
		l.add(100);
		l.add("Kush");
	
		
		for(Object o:l){
			System.out.println(o);
		} */
		
		// TreeSet
		
	/*	Set l =new TreeSet();
		l.add(100);
		l.add(98);
		l.add(102);
		l.add(200);
	
		
		for(Object o:l){
			System.out.println(o);
		}*/
		
		// HashMap
		
	/*	Map m=new HashMap();
		
		m.put(1,"One");
		m.put(4,"Four");
		m.put(2,"Two");
		m.put(2,"Three");
		//m.put(null,"null");
		
		//System.out.println(m.containsValue(null));
	
		m.get(2);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.get(2));
		System.out.println(m.size());
		*/
		//Hashtable
		
	/*	Map m=new Hashtable();
		
		m.put(1,"One");
		m.put(4,"Four");
		m.put(2,"Two");
	
		
		System.out.println(m.containsValue(null));
	
		
		System.out.println(m.keySet());
		System.out.println(m.values());*/
		
		// TreeMap
		
		/*Map m=new TreeMap();
		
		m.put(4,"A");
		m.put(1,"C");
		
		m.put(2,"B");
		
		System.out.println(m.keySet());
		System.out.println(m.values());*/
	}

}
