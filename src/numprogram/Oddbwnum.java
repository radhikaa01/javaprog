package numprogram;

import java.util.Scanner;

public class Oddbwnum {
public static void main(String[] args) {
	int n1,n2,i;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a no");
	n1=s.nextInt();
	System.out.println("enter second num");
	n2=s.nextInt();
	for(i=n1;i<n2;i++)
	{
	if(i%2!=0) 
	{
		System.out.println("odd no"+i);
	}
	}}}
