package h.genericclass;

	

	class Demo<T,X> {
		
		
		T one;
		X two;
		
		Demo(T one,X  two){
			
			this.one=one;
			this.two=two;
		}
		
		T getT(){
			
			return one;
		}
		
		X getX(){
			
			return two;
		}
		
		void Print(){
			
			System.out.println(one.equals(two));
		}
		
	}


public class MainClass {
	
	public static void  main(String args[]){
		
		Demo<Integer,Integer> d1=new Demo<Integer,Integer>(1,3);
		
		System.out.println(d1.getT());
		System.out.println(d1.getX());
		
		d1.Print();
		
	}
	
	

}
