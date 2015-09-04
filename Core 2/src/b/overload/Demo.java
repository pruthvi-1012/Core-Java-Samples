package b.overload;

public class Demo {
	
	public static void main(String argsp[]){
		
		Demo d =new Demo();
	//	d.display((short)0);
		//d.display(null);
		
		d.display(null);
		
	}
	/*
	public void display(String c){
		
		
		System.out.println("String");
		
	}*/
	
	private void display(String c){
		
		
		System.out.println("String");
		
	}
	
	/*private int display(char c){
		
		
		System.out.println("String");
		return 0;
	}*/
	
	
	private void display(String c,int k){
		
		
		System.out.println("String");
		
	}
	
	
	
	/*public void display(Integer s){
		
		System.out.println("Integer");
	}*/
	
	
	
	/*protected int display(short a){
		System.out.println("Short");
		return 0;
	}

	
	protected int display(int a){
		System.out.println("Integer");
		return 0;
	}
	
	protected int display(long a){
		System.out.println("Long");
		return 0;
	}*/
	
	
}
