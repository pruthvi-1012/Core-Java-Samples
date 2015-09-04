package c.interfaces;


interface I1{
	
	public void display();
	
	public void output();
	
	public int print();
}

public class Demo implements I1{

	public static void main(String args[]){
		
		Demo d=new Demo();
		d.display();
		d.output();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("DISPLAY");
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("OUTPUT");
	}

	@Override
	public int print() {
		// TODO Auto-generated method stub
		return 0;
	}

}
