package e.staticExample;



public class Main {
	
	 int count;
	
	Main(){
		count++;
	}
	
	void display(){
		System.out.println(count);
	}
	
	public static void main(String args[]){
		new Main();
		new Main();
		
		new Main().display();
	}
}
