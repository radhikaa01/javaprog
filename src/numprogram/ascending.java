package numprogram;

public class ascending {
public static void main(String[] args) {
	  int a = 80;
      int b = 100;
      int c = 18;

      if (a < b && b < c)
          System.out.println(a + " " + b + " " + c);
      else if (a < c && c < b)
          System.out.println(a + " " + c + " " + b);
      else if (b < a && a < c)
          System.out.println(b + " " + a + " " + c);
      else if (b < c && c < a)
          System.out.println(b + " " + c + " " + a);
      else if (c < a && a < b)
          System.out.println(c + " " + a + " " + b);
      else if (c < b && b < a)
          System.out.println(c + " " + b + " " + a);
}
}

