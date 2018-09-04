package prog01;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the string");
	String x = s.next();
	String rev="";
	for(int i =x.length()-1;i>=0;i--) {
		char ch = x.charAt(i);
		rev = rev + ch;
	}
	if(rev.equals(x)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	s.close();
	}

}
