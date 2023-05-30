package Part1;

import java.util.Arrays;

public class C4 {
	public static void main(String[] args) {
		int[]a= {20,10,40,50,20,30};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		String[]s= {"Sheela","Leela","Dinga","Arun","Channa"};
		Arrays.sort(s);
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}

}
