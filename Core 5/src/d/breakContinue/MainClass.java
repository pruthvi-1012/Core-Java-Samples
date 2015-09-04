package d.breakContinue;

public class MainClass {
	
	public static void main(String args[]){
		
	/*	for(int i=1;i<11;i++){
			
			if(i<=5){
			
				continue;
			}
			System.out.println(i);
		}*/
		
		
		/*for(int i=1;i<11;i++){
			
			if(i>=5){
			
				break;
			}
			System.out.println(i);
		}*/
				
		outer:
		for(int i=0;i<3;i++){
			for(int j=0;j<5;j++){
				
				if(j==0){
					break outer;
				}
				
				System.out.println("Outer Loop");
			}
			
		}
	System.out.println("Good Bye");
		
		
	}

}
