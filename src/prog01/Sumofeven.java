package prog01;

import java.util.Scanner;

public class Sumofeven {
	public static void main(String[] args) {
		 int n01,n02,i,sum=0;
		 Scanner s=new Scanner(System.in);
		 System.out.println("give the numer1");
		n01= s.nextInt();
		System.out.println("give the number2");
		n02=s.nextInt();
		
		for(i=n01;i<=n02;i++) 
		{
		if(i%2==0) 
		{
			
			
			//System.out.println(i);
			sum=sum+i;
		}
		
		
	}
		System.out.println(sum);

}}
