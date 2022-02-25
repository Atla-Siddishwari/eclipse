package com;

public class DefaultThread {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("MY Thread");
		t.setPriority(1);
		System.out.println(t);
		
		
	}

}
