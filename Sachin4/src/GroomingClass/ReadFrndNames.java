package GroomingClass;

import java.util.Iterator;
import java.util.Scanner;

public class ReadFrndNames {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many frnds name to be store");
		int size=s.nextInt();
		String[]name=new String[size];
		System.out.println("Enter the names");
		for(int i=0;i<name.length;i++) {
			name[i]=s.next();
		}	
    /*     for (int i = 0; i < name.length; i++) {
			if(name[i].charAt(i).equals("p"))
		}*/
   }
}
