package prog01;

public class Min {
public static void main(String[] args) {
	int arr[]= {40,6,7,8,7,9,2,0,-1};
	 int min = arr[0];
	
	for(int i=1;i<arr.length;i++) 
	{
		if(min>arr[i]) 
		{
			min=arr[i];
		}
	}
	System.out.println(min);
}
}
