package FinalMockRvision;

import java.util.Scanner;

public class ReadCharFromScanner {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=s.next().charAt(0);
		System.out.println(ch);
		
	}

}
