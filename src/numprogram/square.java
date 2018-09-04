package numprogram;
import java.lang.Math;
public class square {
public static void main(String[] args) {
	int x=1,y=2,z=5;
	
	if(((Math.pow(x, 2)+y*y)==z)||((y*y+z*z)==x)||((x*x+z*z)==y))
	{
		System.out.println("true");
	}
	else 
	{
		System.out.println("false");
	}
	
}
}
