package i.genericMethod;

import java.util.ArrayList;
import java.util.List;



		class Sample{
			
		}



		class Demo{
			
			public <T> void add(T t){
				
				List<T> list=new ArrayList<T>();
				list.add(t);
				
				
			}
		}
	
public class MainClass {

	public static void main(String args[]){
		
		Demo d=new Demo();
		d.add(new Sample());
		
	}
}
