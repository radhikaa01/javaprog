package prog01;

public class array2 {
	public static void passByReference(String a[]){
	     a[0] = "Changed";
	   }
	 
	   public static void main(String args[]){
	      String []b={"Apple","Mango","Orange"};
	      System.out.println("Before Function Call    "+b[0]);
	      array2.passByReference(b);
	      System.out.println("After Function Call    "+b[0]);
	   }
}
