package GroomingClass;

import java.util.Iterator;
import java.util.Scanner;

public class ReadChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of character");
		int size=s.nextInt();
		String s1=s.next();
		//char ch=s1.charAt(0);
		char[]ch=new char[size];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=s1.charAt(i);
		}
		System.out.println(ch);
	}

}
