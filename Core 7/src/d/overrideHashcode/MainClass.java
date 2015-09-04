package d.overrideHashcode;

public class MainClass {

	public static void main(String args[])
	{
		
	}
}

	
	class HashClass{
		public int x;
		
		HashClass(int x){
			this.x=x;
		}
		
		public boolean equals(Object o){
		HashClass h=(HashClass)o;
		
		if(h.x==this.x){
			return true;
		}else{
			return false;
		}
	}
		
		public int hashCode(){
			return (x*17);
		}
	}
