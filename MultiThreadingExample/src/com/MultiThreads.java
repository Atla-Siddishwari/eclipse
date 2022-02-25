package com;
class Task implements Runnable{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println(name);
	}
	
}

public class MultiThreads {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		Task tt=new Task();
		Thread t1=new Thread(tt);
		Thread t2=new Thread(tt);
		Thread t3=new Thread(tt);
		t1.setName("Siddu");
		t1.start();
				
		
		

	}

}
