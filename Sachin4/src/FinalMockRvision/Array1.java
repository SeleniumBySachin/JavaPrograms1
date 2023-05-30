package FinalMockRvision;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
	
		
	}
	public static void display(int[]a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	public static int[] toRead() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no of element to be store");
		int size=s.nextInt();
		int[]c=new int[size];
		System.out.println("enter the elements");
		for (int i =0; i <c.length; i++) {
			c[i]=s.nextInt();
		}
		return c;
	}
	public static int largest(int[]a) {
		int big=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big) {
				big=a[i];
			}
		}
		return big;
	}
	public static int[] zigZag(int[]a,int[]b) {
		int []c=new int[a.length+b.length];
	    int i=0;
	    int j=0;
	    while(i<a.length&&i<b.length) {
	    	c[j]=a[i];
	    	j++;
	    	c[j]=b[i];
	    	j++;
	    	i++;
	    }
	    while(i<a.length) {
	    	c[j]=a[i];
	    }while(i<b.length) {
	    	c[j]=b[i];
	    }
	    return c;
	}

}
