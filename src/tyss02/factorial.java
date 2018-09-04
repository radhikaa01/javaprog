package tyss02;

import java.util.Scanner;

public class factorial {
	public static void main(String[] args) 
	{
    int n, f=1;
	Scanner s=new Scanner(System.in);
    System.out.println("Enter any number :");
	n=s.nextInt();
    for(int i=1; i<=n; i++)
	{
	f=f*i;
	}
	System.out.println("Factorial is :" +f);
	s.close();
	}

}
