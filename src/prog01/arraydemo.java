package prog01;

public class arraydemo {
public static void main(String[] args) {
	int array[] = new int[7];
    for (int count=0;count<7;count++)//indexing
    {
       array[count]=count+1;
   }
   for (int count=0;count<7;count++)//printing of array
   {
       System.out.println("array["+count+"] = "+array[count]);
   }
  System.out.println("Length of Array  =  "+array.length);
  // array[8] =10;
}
}
