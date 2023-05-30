 package GroomingClass;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of element to be store");
		int size=s.nextInt();
		double []a=new double[size];
		double sum=0;
		System.out.println("Enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextDouble();
		}
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("The sum of elements: "+sum);
	}

}
