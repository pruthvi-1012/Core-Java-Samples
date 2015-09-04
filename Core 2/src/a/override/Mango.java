package a.override;

	class Eatable{
		
	}

	class Fruit extends Eatable{ 
		
		public Fruit taste(){
			Fruit m=new Fruit();
			return m;
		}
	}

public class Mango extends Fruit {
	
	public static void main(String args[]){
		
	}
	
	public Mango taste(){
		Mango m=new Mango();
		return m;
		
		
	}

}
