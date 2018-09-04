package prog01;

import java.util.Scanner;

public class evenodd {
public static void main(String[] args) {
	int i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no:-");
	i=s.nextInt();
	if(i%2==0) 
	{
		System.out.println("even");
	}	
	
	else
	System.out.println("odd");
	s.close();
}
}
