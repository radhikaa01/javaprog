package prog01;

public class Factorial {
	public static void main(String[] args) {
		int fect=1,n=5;
		
		for(int i=1;i<=n;i++) 
		{
			fect=fect*i;
		}
		System.out.println(fect);
	}

}
