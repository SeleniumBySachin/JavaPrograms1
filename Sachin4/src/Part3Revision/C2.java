package Part3Revision;

import java.util.ArrayList;
import java.util.Scanner;

public class C2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no elements to be store");
		int size=s.nextInt();
		System.out.println("Enter the elements");
		ArrayList ls=new ArrayList();
		for(int i=0;i<size;i++) {
			ls.add(s.nextInt());
		}
		System.out.println(ls);
	}

}
