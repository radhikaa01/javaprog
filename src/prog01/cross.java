package prog01;

import java.util.Scanner;

public class cross {
public static void main(String[] args) {
	Scanner	sc=new Scanner(System.in);
	System.out.println("enter	value	of	n");
	int	n=sc.nextInt();
	for(int	i=1;i<n ;i++)
	{
	for	(int	j=0;j<n	;j++	)
	{
	if(i==j||i	+ j==n-1)
	System.out.print("*");
	else
	System.out.print("	");
	}
	System.out.println();
}
	sc.close();
}
}