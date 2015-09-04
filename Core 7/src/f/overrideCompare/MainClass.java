package f.overrideCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class MainClass {

	public static void main(String args[]){
						
		List<Dvd> l=new ArrayList<Dvd>();
		
		l.add(new Dvd("C","y"));
		l.add(new Dvd("A","x"));
		l.add(new Dvd("B","z"));
		Collections.sort(l,new Third());
		
		for(Object o:l){ 
			
			System.out.println(((Dvd)o).toString());
		}
		
	}
}


	class Third implements Comparator<Dvd>{

		@Override
		public int compare(Dvd o1, Dvd o2) {
			// TODO Auto-generated method stub
			return (o1.getSinger()).compareTo(o2.getSinger());
		}
		
	}


	class Dvd {
		
		String title,Singer;
		
		Dvd(){
			
		}
		
		Dvd(String title,String Singer){
			this.title=title;
			this.Singer=Singer;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getSinger() {
			return Singer;
		}

		public void setSinger(String singer) {
			this.Singer = singer;
		}
		
		public String toString(){

			return "Title::"+title+"  Singer::"+Singer;
		}

		

	}
