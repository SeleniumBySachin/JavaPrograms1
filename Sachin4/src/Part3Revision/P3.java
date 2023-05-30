package Part3Revision;

import java.util.Scanner;

public class P3 {
	 public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the no of element to be store");
			int size=s.nextInt();
			int[]a=new int[size];
			int sum=0;
			System.out.println("Enter the elements");
			for(int i=0;i<a.length;i++) {
				a[i]=s.nextInt();
			}
			System.out.println("The elements are:");
	        for(int i=0;i<a.length;i++) {
	        	sum+=a[i];
	        }
			System.out.println("The sum of all the elements: "+sum);
		}

}
