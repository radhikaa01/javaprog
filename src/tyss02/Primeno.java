package tyss02;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number");
	int x = s.nextInt();
	boolean rs = isPrime(x);
	if(rs) {
		System.out.println(x+"is a prime no");
	}
	else {
		System.out.println(x+"is not a prime no");
	}
		s.close();
}

	private static boolean isPrime(int x) {
	int i=2;
	while(i<=x/2) {
		if(x%i==0) {
		return false;
	}
i++;
		
	}
	return true;
}
}	
	