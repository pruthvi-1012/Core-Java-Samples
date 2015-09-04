package com.thread.sleep;

class Number implements Runnable{
	
	public void run(){
		
		for(int i=1;i<=100;i++){
			
			
			if(i%10==0){
				
				System.out.println("Number which is divisible by 10 is here::"+i);
			}
			
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		
		
	}
}

public class Count {
	
	public static void main(String args[]){
		Number n=new Number();
		Thread t=new Thread(n);
		t.start();
		
		//System.out.println(Thread.currentThread().getPriority());
	}

}
