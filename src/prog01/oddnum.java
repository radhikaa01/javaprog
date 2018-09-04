package prog01;

import java.util.Scanner;

public class oddnum {
public static void main(String[] args) {
	 int n01,n02,i;
	 Scanner s=new Scanner(System.in);
	 System.out.println("give the numer1");
	n01= s.nextInt();
	System.out.println("give the number2");
	n02=s.nextInt();
	
	for(i=n01;i<=n02;i++) 
	{
	if(i%2!=0) 
	{
		System.out.println(i);
	}
	s.close();
}
	}
}
