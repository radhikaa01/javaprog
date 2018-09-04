package prog01;

public class EachwordReverse {
	public static void main(String[] args) {
		String s= "test yantra me";
		char[] sarry = s.toCharArray();
		s.split("");
		for(int i=sarry.length-1;i>=0;i--) 
		{
			System.out.print(sarry[i]);
		}
	}
}
