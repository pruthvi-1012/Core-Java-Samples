package f.enums;


	enum Size{SMALL,MEDIUM,LARGE}


public class Demo1 {
	
	public static void main(String args[]){
		
		//Size s=Size.LARGE;
		
		//System.out.println(s);
		
		for(Size s1:Size.values()){
			System.out.println(s1);
		}
	}

}
