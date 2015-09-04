package i.tokenizer;

public class MainClass {
	
	public static void main(String args[]){
		String s="a,bc,fg";
		String arr[]=s.split(",");
		
		for(String x:arr){
			System.out.println(x);
		}
	}

}
