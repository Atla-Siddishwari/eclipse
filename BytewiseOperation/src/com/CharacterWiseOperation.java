package com;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterWiseOperation {
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter the name");
		String name=br.readLine();
		System.out.println("Your id is "+id);
		System.out.println("Your name is "+name);
		
	}

}
