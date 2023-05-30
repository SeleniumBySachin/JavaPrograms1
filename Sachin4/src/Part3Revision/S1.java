package Part3Revision;

import java.util.Arrays;

public class S1 {
	public static void main(String[] args) {
		int []a={30,10,40,20};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	     System.out.println("===========");
	     for(int i=a.length-1;i>=0;i--) {
	    	 System.out.println(a[i]);
	     }
		
	}

}
