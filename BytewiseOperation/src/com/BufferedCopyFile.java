package com;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class BufferedCopyFile  {
	public static void main(String args[])throws Exception {
		FileInputStream fis=new FileInputStream("abc.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos= new FileOutputStream("Demo.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
				 int ch;
				 while((ch=bis.read())!=-1) {
					 bos.write(ch);
					 
				 }
				 bos.flush();
				 fis.close();
				 fos.close();
				 System.out.println("File Copied");
		
	}

}
