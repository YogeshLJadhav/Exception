package com.trycatch.finaly;

import java.util.Scanner;

public class FinallyDemo1 {
	 
	public void div() {
	
		Scanner Sc=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		int a=Sc.nextInt();
		System.out.println("Please enter the value of b");
		int  b=Sc.nextInt();
		
		int c;
		
		c=a/b;
		System.out.println("Answer is");
		System.out.println(c);
		
		}
	public static void main(String []args) {
		FinallyDemo1 fd1=new FinallyDemo1();
		
		fd1.div();	
}

}
