package tyss02;

public class p8 {
public static void main(String[] args) {
	int k=0;
	for(int i=1;i<=4;i++) 
	{
		k=k+i;
		for(int j=k;j>k-i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}
}
}
