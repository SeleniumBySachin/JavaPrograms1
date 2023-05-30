package Part3Revision;

import java.util.Scanner;

public class P2 {
      public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of element to be store");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The elements are:");
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
		
	}
}
