package GroomingClass;

import java.util.Scanner;

public class CreateArrayObject {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
