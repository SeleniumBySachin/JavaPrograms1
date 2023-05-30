package Part3Revision;

import java.util.Scanner;

public class D13 {
	public static void main(String[] args) {
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value");
		int a=s.nextInt();
		System.out.println("Enter the second value");
		int b=s.nextInt();
		int res=a/b;
		System.out.println("Multiplication of two no is: "+res);
		}
		catch(Exception e) {
			System.out.println("Exception is handled");
		}
	}

}
