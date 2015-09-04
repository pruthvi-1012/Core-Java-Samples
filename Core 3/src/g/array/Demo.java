package g.array;

public class Demo {

	public static void main(String args[]){
		
		int y=10;
		int[]x={4,y,3};
		for(int i:x)
		{
			System.out.println(i);
		}
		
		
		int a[]=new int[2];
		int b[]=a;
		System.out.println("Length::"+b.length);
	}
}
