package Grooming;

import java.util.ArrayList;
import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of emp to be store");
		int size=s.nextInt();
		ArrayList ls=new ArrayList ();
		for(int i=0;i<size;i++) {
			System.out.println(i+1+" enter the name: ");
			s.nextLine();
			String name=s.nextLine();
			System.out.println("enter the eid: ");
			int eid=s.nextInt();
			System.out.println("enter the sal: ");
			double sal=s.nextDouble();
			Emp e=new Emp(eid,name,sal);
			ls.add(e);
		}
		System.out.println(ls);
	}

}
