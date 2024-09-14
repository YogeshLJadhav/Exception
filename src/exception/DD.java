package exception;
import java.util.Scanner;
public class DD {
	int a;
	int b;
	public void array() {
		int m;
		int count = 0;
		int[] x= {1,2,36,4,3,5,6,3,4,5,7,8,5,4,67,8,43,34,45,2,4,6,42};
		int z=x.length;
	try {
		for(int i=0;i<=z;i++) {
			m=x[i];
			System.out.println(m);
			count++;
		}
	}
	catch(ArrayIndexOutOfBoundsException d) {
		System.out.println(d);
	}
	System.out.println("Count ="+count);
	System.out.println("array executed");

}
}