package d.arithmetic;

public class MainClass {
	
	public static void main(String args[]){
		
		int a=10;
		int b=15;
		
		System.out.println("Addition is::"+(a+b));
		System.out.println("Subtraction is::"+(a-b));
		System.out.println("Multiplication is::"+(a*b));
		System.out.println("Division is::"+(a/b));
		System.out.println("Remainder is::"+(a%b));
		
		String s1="AB";
		String s2="CD";
		
		System.out.println("String Concatenation is::"+(s1+s2));
		
		String s3="number::";
		
		System.out.println(s3+a+b);
		System.out.println(s3+(a+b));
		System.out.println(a+b+s3);
		System.out.println(a+b+s3+a+b);
		System.out.println(a+b+s3+(a+b));
		
	}

}
