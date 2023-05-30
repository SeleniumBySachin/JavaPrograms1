package Part3Revision;

import java.util.Scanner;

public class D5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Eneter your color");
		String color=s.nextLine();
		String s1="";
		for(int i=color.length()-1;i>color.length()-3;i--) {
			s1=color.charAt(i)+s1;
		}
		System.out.println(s1);
	}

}
