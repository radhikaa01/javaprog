package prog01;

import java.util.Scanner;

public class Prime2 {
	public static void main(String[] args) {
		Scanner	sc=new Scanner	(System.in);
		System.out.println	("enter	number");
		int	n=sc.nextInt	();
		System.out.println	("Prime	numbers	between	1	and	"	+	n);
		
		for	(int	i=1;	i	<	n;	i++)
		{
		boolean	isPrime	=	true;
	
		for	(int	j=2;	j	<	i	;	j++)
		{
		if	(i	%	j	==	0)
		{
		isPrime	=	false;
		break;
		}
		}

		if	(isPrime)
		System.out.print	(i	+	"	");
	}
sc.close();
}}
