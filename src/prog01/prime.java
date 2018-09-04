package prog01;

import java.util.Scanner;

public class prime {
public static void main(String[] args) {
	int a,i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no");
	a=s.nextInt();
	
	for(i=2;i<=a;i++)
	{
		if(a%i==0) 
		{
			System.out.println("not prime");
		
		}

	
		else  {
			System.out.println("prime");
		}
		break;
	}
	s.close();
}

}
