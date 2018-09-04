package tyss02;

public class reversestring {
	public static void main(String[] args) {
		String s= "12345";
		
		  byte[] t = s.getBytes();
		 
	         char[] result = new char [t.length];
	         for (int i = 0; i<s.length(); i++) 
	         {
	             result[i] =   s.charAt(s.length()-i-1);
	         }
	                System.out.println(new String(result));      
	}

}
