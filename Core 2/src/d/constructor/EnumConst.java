package d.constructor;


	enum Coffesize{
		
		BIG(10),SMALL(3),MEDIUM(5);
		
		int price;
		Coffesize(int price){
			
			this.price=price;
			
		}
		
		int getPrice(){
			return price;
		}
	}

public class EnumConst {

	
	public static void main(String args[]){
		
//		/System.out.println(Coffesize.BIG.getPrice());
		
		for(Coffesize c:Coffesize.values()){
			
			System.out.println(c.getPrice());
			
		}
	}
}
