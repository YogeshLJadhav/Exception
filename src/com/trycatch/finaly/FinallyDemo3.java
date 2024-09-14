package com.trycatch.finaly;

	import java.util.Scanner;

	public class FinallyDemo3 {
		 
		public void div() {
		
			Scanner Sc=new Scanner(System.in);
			System.out.println("Please enter the value of a");
			int a=Sc.nextInt();
			System.out.println("Please enter the value of b");
			int  b=Sc.nextInt();
			
			int c=(Integer) null;
			try {
			
			c=a/b;
			
			System.out.println("Answer is");
			System.out.println(c);
			}
			catch(NullPointerException exception) {
				System.out.println();
				System.out.println("Please enter the value grater than Zero");
				FinallyDemo3 fd2=new FinallyDemo3();
				fd2.div();
			}
			finally {
			    System.out.println("finally block");
			}
		}
			
		public static void main(String []args) {
			FinallyDemo3 fd2=new FinallyDemo3();
			
			fd2.div();	
	}
	}
