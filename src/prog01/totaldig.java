package prog01;

public class totaldig {
public static void main(String[] args)
{
	int count = 0 ;
	long num = 345445;
    while(num != 0)
    {
        num = num/10;
        ++count;
    }

    System.out.println("Number of digits: " + count);
}

}
