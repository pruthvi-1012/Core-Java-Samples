package com.thread.starting;

public class Simple extends Thread {
	
	public static void main(String args[]){
		
		Simple s=new Simple();
		Thread t=new Thread(s,"Abc");
		t.start();
		//t.start();(You can't start thread again once it's dead)
		
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			
			System.out.println(Thread.currentThread().getName()+":::Simple:::"+i);
			
		}
	}
	

}
