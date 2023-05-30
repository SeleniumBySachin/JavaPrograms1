package Part3Revision;

import java.util.Scanner;

public class P4 {
	 public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the no of element to be store");
			int size=s.nextInt();
			int[]a=new int[size];
			int odd=0;
			int even=0;
			System.out.println("Enter the elements");
			for(int i=0;i<a.length;i++) {
				a[i]=s.nextInt();
			}
			
	        for(int i=0;i<a.length;i++) {
	        	if(i%2==0) {
	        		odd+=a[i];
	        	}
	        	else
	        		even+=a[i];
	        }
	        System.out.println("Sum of odd: "+odd);
	        System.out.println("Sum of even: "+even);
			
		}

}
