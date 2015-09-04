package g.array;

public class MainClass {
	


	public static void main(String args[]){
	
		int[]a=new int[10];
		int[][]b=new int[1][];
		b[0]=new int[3];
		
		for(int i:a){
			System.out.println(i);
		}
		
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
		
		for(int i[]:b){
			
			for(int j:i){
				System.out.println(j);
			}
		}
		
		
	}

}
