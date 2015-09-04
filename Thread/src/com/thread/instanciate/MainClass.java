package com.thread.instanciate;

class MyRunnable implements Runnable{

	public void run() {
		System.out.println("Thread running in MyRunnable");
		
	}
	
}

class Simple implements Runnable{
	
	public void run(){
		System.out.println("Thread running in Simple Class");
	}
}

class MyThread extends Thread{
	
	public void run(){
		System.out.println("Thread running in MyThread");
	}
	
	public void run(String s){
		System.out.println("String in MyThread is::"+s);
	}
}

public class MainClass{	
	
	public static void main(String args[]){
		MyRunnable r=new MyRunnable();
		Simple s=new Simple();
		MyThread t=new MyThread();
		
		
		Thread foo=new Thread(r);
		Thread bar=new Thread(s);
		Thread a=new Thread(t);
		
		foo.start();
		bar.start();
//		/a.start();
		t.start();
		
		//t.run();
		//t.run("Hi");
	}
}
