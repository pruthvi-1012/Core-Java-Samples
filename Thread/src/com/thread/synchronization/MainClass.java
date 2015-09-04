package com.thread.synchronization;



public class MainClass implements Runnable {
	int a=97;
	
	
	

	
	public static void main(String args[]){
		
		MainClass mc=new MainClass();
		Thread t1=new Thread(mc);
		Thread t2=new Thread(mc);
		Thread t3=new Thread(mc);
		
		t1.setName("Fred");
		
		t2.setName("Jill");
		
		t3.setName("JAck");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

	public void run() {
		
//		System.out.println(Thread.currentThread().getName()+"  is inside a Run Method");
	
		display();
		
		
	}
	
	private synchronized void display(){
		
		System.out.println(Thread.currentThread().getName()+"  is INSIDE SYNCHRONIZED BLOCK");
					
		for(int i=1;i<=100;i++){
			
			System.out.print(a);
		}
		
		System.out.println();
		
		a=a+1;
	}
	
	
	
}
