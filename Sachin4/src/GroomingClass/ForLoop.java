  package GroomingClass;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Elements in array");
		for(int b:a) {
			System.out.println(b);
		}
	}

}
