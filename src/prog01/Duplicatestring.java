package prog01;

public class Duplicatestring {
public static void main(String[] args) {
	String a[]= {"radhika","radhika"};
	for(int i=0;i<a.length;i++) 
	{
		for(int j=i+1;j<a.length;j++) 
		{
			if(a[i]==a[j])
				System.out.println(a[j]);
		}
	}}
}
