package prog01;

public class Bubble {
public static void main(String[] args) {
	int i,j;
	int ar[]= {7,3,19,5,1,2};
	//System.out.println(ar[4] +ar[2]);
	
	for(i=1;i<=ar.length-1;i++) 
	{
		for(j=0;j<ar.length-1-i;j++) 
		{
			if(ar[j]>ar[j+1]) 
			{
			
			int temp=ar[j];
			ar[j]=ar[j+1];
			ar[j+1]=temp;
			}
			
			}
		}
	for(int k=0;k<ar.length-1;k++)
		System.out.print(ar[k]);
	}
}

