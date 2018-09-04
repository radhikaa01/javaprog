package tyss02;

public class p9 {
	 static int i;
public static void main(String[] args)
{
	 EXAMPLE1();
}

public static  void EXAMPLE1 ()
{
	System.out.println("good morning");
      i++;
      if(i<10) 
      {
    	  EXAMPLE1();
      }
      else
    	  return;
	}
}
