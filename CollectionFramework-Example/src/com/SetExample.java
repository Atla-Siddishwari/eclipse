package com;

import java.util.HashSet;
import java.util.Set;
class A{ }
class B{ }
public class SetExample {
	public static void main(String args[]) {
	HashSet ss=new HashSet();
	int a=10;
	Integer b=new Integer(a);
	ss.add(b);
	ss.add(20);
	ss.add(30.30);
	ss.add("Siddu");
	ss.add(true);
	A obj1=new A();
	B obj2=new B();
	ss.add(obj1);
	ss.add(obj2);
	System.out.println(ss);

}

}
