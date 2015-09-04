package com.thread.join;







class Myrunnable implements Runnable{
	
	public void run(){
		for(int x=1;x<=100;x++){
			System.out.println(Thread.currentThread().getName()+"::::Runnable Running::::"+x);
		}
		
		
	}
}



public class MainClass {

	public static void main(String args[]){
		Myrunnable r=new Myrunnable();
		
		Thread t1=new Thread(r,"Thread One");
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread t2=new Thread(r,"Thread Two");
		t2.start();
	}
}
