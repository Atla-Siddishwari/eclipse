package com;

public class StringDemo {

	public static void main(String[] args) {
		String str1="Welcome to java";
		String str2=new String("Welcome tyo java");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.substring(3));        // start from 0 position 
		System.out.println(str1.substring(2,4));    // start from 0 postion 2nd parameter size -1
		System.out.println(str1.indexOf("e"));            // from left to right e index position 
		System.out.println(str1.lastIndexOf("o"));// right to left o index position 
		String str3="Siddu";
		String str4="Siddu";
		String str5=new String("Siddu");
		String str6=new String("Siddu");
		if(str3.equals(str6)) {
			System.out.println("equal");
		}else
		{
			System.out.println("not equal");
		}
		
		

	}

}
