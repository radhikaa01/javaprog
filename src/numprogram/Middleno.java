package numprogram;

public class Middleno {
public static void main(String[] args) {
	int a=10,b=36,c=30;
	if(a>b)
	{
		if(b>c)
		{
			System.out.println("b is middle one");
		}
		else if(c>a)
		{
		System.out.println("a is middle one");
		}
		else
		{
			System.out.println("c is middle one");
		}
	}
	else
	{
		if(b<c)
		{
			System.out.println("b is middle one");
		}
		else if(c<a)
		{
			System.out.println("a is middle one");
		}
		else
		{
			System.out.println("c is middle one");
		}
	}	
}
}
