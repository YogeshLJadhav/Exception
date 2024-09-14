package exception;

import java.util.Scanner;

public class Division {
int a;
int b;
public void div() {
	Scanner sc=new Scanner(System.in);
	System.out.println("please enter thr value of a");
	
	 a=sc.nextInt();
	 System.out.println("please enter thr value of b");
	 b=sc.nextInt();
	 
	 try {
		 System.out.println("try block");
		 int c=a/b;
		 System.out.println(c);
	 }
	 catch(ArithmeticException e) {
		 System.out.println("This is a catch block");
		 System.out.println("please enter number grater than zero");
		
		 
	 }
	 System.out.println("line no 26");
	 System.out.println("line no 27");
	 System.out.println("division method exit");
	 

}
     public static void main(String[] args) {
    	 Division a=new Division();
    	 a.div();
    	 
	
}
}
