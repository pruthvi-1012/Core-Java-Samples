package c.overrideEqual;

public class MainClass {

	public static void main(String args[]){
		Demo d1=new Demo(1);
		Demo d2=new Demo(1);
		//Demo d3=d2;
		System.out.println(d1.equals(d2));
	}
}

	class Demo{
		
		int n;
		
		Demo(int n){
			this.n=n;
		}
		
		public int getValue(){
			return n;
		}
		
		public boolean equals(Object o){
			if((o instanceof Demo) && ((Demo)o).getValue()==this.n){
				
				return true;
					
			} else {
				
				return false;
			}
		}
	}
