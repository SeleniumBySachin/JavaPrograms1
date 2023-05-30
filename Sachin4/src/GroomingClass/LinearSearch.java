package GroomingClass;

import java.util.Iterator;
import java.util.Scanner;

public class LinearSearch {
   public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=s.nextInt();
		int []a=new int[size];
		int count=0;
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the searching elements");
		int key=s.nextInt();
		for (int i = 0; i < a.length; i++) {
			if(key==a[i]) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("no");
		}
		else
			System.out.println("yes");
}
}
