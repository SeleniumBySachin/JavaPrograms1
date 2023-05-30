package Array;

import java.util.Arrays;

public class Sort1 {
	public static void main(String[] args) {
	int[]a= {20,30,10,50,40};
	Arrays.sort(a);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("==========");
	byte[]b= {20,30,10,50,40};
	Arrays.sort( b);
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
	System.out.println("===========");
	char[]ch= {'b','a','d','c'};
	Arrays.sort(ch);
	System.out.println(ch);
	System.out.println("============");
	boolean []b1= {true,false,true};
     String []s= {"channa","aruna","banu"};
     Arrays.sort(s);
     for (int i = 0; i < s.length; i++) {
		System.out.println(s[i]);
	}
}

}
