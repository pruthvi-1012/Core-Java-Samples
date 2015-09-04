package g.var.args;

public class Demo1 {
	
	public static void main(String args[]){
		
		Demo1 d=new Demo1();
		d.display("a",3);
		d.display("a",2,6);
	}
	
	public void display(String a,int...x){
		
		System.out.println("Var Args "+x[0]+"  "+a);
		
	}
	
	public void display(String a,int x){
		System.out.println("Method:"+x+"  "+a);
	}

}
