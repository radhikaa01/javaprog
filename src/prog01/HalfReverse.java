package prog01;

public class HalfReverse {

	public static void main(String[] args) {
	String words="test";

	int mid = words.length()/2;
	for(int i=mid-1;i>=0;i--) 
	{
		
	System.out.print(words.charAt(i));	
		
	 
	}
	for(int j=words.length()-1;j>=mid;j--) 
	{
		System.out.print(words.charAt(j));
	}

	}

}
