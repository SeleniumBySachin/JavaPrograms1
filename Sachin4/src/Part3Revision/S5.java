package Part3Revision;

import java.util.Arrays;

public class S5 {
	public static void main(String[] args) {
		int []a= {20,10,40,50,30,80,60,70,100,90};
		System.out.println("Before sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Arrays.sort(a,a.length/2,a.length);
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

} 
