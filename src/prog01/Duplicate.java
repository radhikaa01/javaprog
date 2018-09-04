package prog01;

public class Duplicate {
public static void main(String[] args) {
	int a[]= {1,23,25,26,25,1};
	for(int i=0;i<a.length;i++) 
	{
		for(int j=i+1;j<a.length;j++) 
		{
			if(a[i]==a[j])
				System.out.println(a[j]);
		}
	}
}
}
