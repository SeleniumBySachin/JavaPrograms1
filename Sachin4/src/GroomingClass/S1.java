package GroomingClass;

import java.util.Iterator;
import java.util.Scanner;

public class S1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the searching elements");
		int key=s.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(key==a[i]) {
				count++;
				break;
			}
		}
		if(count==1) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
		
	}

}
