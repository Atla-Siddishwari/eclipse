package com;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class BytewiseFileCopy {
	public static void main(String args[])throws Exception {
		FileInputStream fis=new FileInputStream("abc.txt");
		FileOutputStream fos= new FileOutputStream("Demo.txt");
				 int ch;
				 while((ch=fis.read())!=-1) {
					 fos.write(ch);
					 
				 }
				 fis.close();
				 fos.close();
				 System.out.println("File Copied");
		
	}

}
