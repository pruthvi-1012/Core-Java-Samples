package h.wrapper;

public class MainClass {
	
	public static void main(String args[]){
		
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		//i1=i1+i2;
		//System.out.println( i1 + i2 );
		
		Integer i3;
		i3=i2;
		
		//System.out.println(i1);
		
		if(i1.equals(i2)){
			System.out.println("true");
		}
		
		if(i2==i3){
			System.out.println("true");
		}
	}
	
	Integer getInt(){
		//Integer i=new Integer(100);
		int i=10;
		return i;
	}

}
