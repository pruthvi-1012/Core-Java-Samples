package f.passbyref;

public class MainClass {
	
		int value=200;
	//	static int number=1000;
	public static void main(String args[]){
		
		Dimension d=new Dimension();
		MainClass mc=new MainClass();
		
		System.out.println("Before\n value:"+mc.value);
		
		modify(mc.value);
			
		System.out.println("After\n value:"+mc.value+"\n");
		
		System.out.println("Before\n Height:"+d.height);
		
		modify(d);
		
		System.out.println("After\n Height:"+d.height);
		
	/*	System.out.println("Before\n Number:"+number);
		
		modify(number);
		
		System.out.println("After\n Number:"+number);*/
		
		
		
	}
	
	public static void modify(Dimension d){
		d.height=d.height+1;
	}
	public static void modify(int value){
		value=value+1;
	}

}

class Dimension{
	
	int height=100;
	
}
