package casting;

	class Animal{
		
		public void makenoise(){
			System.out.println("Noise");
		}
	}
	
	class Dog extends Animal{
		
		public void makenoise(){
			System.out.println("Bark (OverLoaded)");
		}
		
		public void eat(){
			System.out.println("Eat (OverLoaded)");
		}
	}

public class Sample {
	
	public static void main(String args[]){
		
		/*Animal a=new Animal();
		a.makenoise();
		
		Dog d=new Dog();
		d.makenoise();*/
		
		// Down-Casting
		
		Animal a1=new Dog();
		a1.makenoise();
			
		Dog d1=(Dog)a1; 
		d1.eat();
		
		// Up Casting
		
		Dog d=new Dog();
		
		Animal a=(Animal)d;
		a.makenoise();
		
		
	}
}
