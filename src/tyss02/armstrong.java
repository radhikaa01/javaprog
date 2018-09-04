package tyss02;

import java.util.Scanner;

public class armstrong {
public static void main(String[] args) {
	int arm=0,a,d,no;
	Scanner s= new Scanner(System.in);
	System.out.println("enter the number:");
	no=s.nextInt();

	
	
	d=no;
	while(no>0)
	{
	a=no%10;
	no=no/10;
	arm=arm+a*a*a;
	
	}
	System.out.println(d);
	
	s.close();
	
	
}
}
