package prog01;

import java.util.Scanner;

public class factorial {
public static void main(String[] args)
{
	int i,fect,n=1;
	Scanner s=new Scanner(System.in);
	System.out.println("give the number");
	fect=s.nextInt();
	
	for(i=0;i<fect;i++) 
	{
	n=n*(fect-i);
	
	}
	System.out.println(n);
	
	s.close();
}
}
