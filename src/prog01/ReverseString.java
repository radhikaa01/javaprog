package prog01;

public class ReverseString {
public static void main(String[] args) {
	String s= "test yantra ";
	char[] sarry = s.toCharArray();
	
	for(int i=sarry.length-1;i>=0;i--) 
	{
		System.out.print(sarry[i]);
	}
}
}
