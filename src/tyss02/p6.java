package tyss02;

public class p6 {
	public static void main(String[] args) {
	
		String s1="JAVA";
		char[] C =s1.toCharArray();
		for(int i=0;i<C.length;i++) 
		{
			for(int j=0;j<=i;j++)
			{
				
				System.out.print(C[j]);
			}
			System.out.println();
		}
		
	}

}
