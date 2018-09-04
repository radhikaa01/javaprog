package tyss02;

import java.util.Scanner;

public class febse {
public static void main(String[] args) {
	int i,n, first=0, second=1, next;
	Scanner  s=new Scanner(System.in);
	System.out.println("Enter number of terms for Series: ");
	n=s.nextInt();
	first=0;
	second=1;
	System.out.println("Fibonacci series are: ");
	 for(i=0; i<n; i++)
	 {
	  System.out.println(first);
	  next = first + second;
	  first = second;
	  second = next;
	  }
s.close();
}
}
