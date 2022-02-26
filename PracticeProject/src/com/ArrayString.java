package com;
import java.util.Scanner;

public class ArrayString {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int no;
		System.out.println("Strings");
		no=input.nextInt();
		input.skip(System.lineSeparator());
		String[] names=new String[no];
		for(int counter=0;counter <no; counter++) {
			System.out.println("Enter the string "+(counter+1));
			names[counter]=input.nextLine();
		}
		
		input.close();
		System.out.println("Strings are ");
		for(int counter=0;counter<no; counter++) {
			System.out.println(names[counter]);
		}
	}

}
