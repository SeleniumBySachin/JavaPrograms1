package GroomingClass;

import java.util.Scanner;

public class S {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Before sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
