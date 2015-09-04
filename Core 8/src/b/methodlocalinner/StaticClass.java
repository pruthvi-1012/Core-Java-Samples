package b.methodlocalinner;

	class Outside{
		
		private static int x=1000;
		
		public  static void display(){
			
			class Inside{
				
				public void output(){
					System.out.println(x);
				}
			}
		}
	}

public class StaticClass {

}
