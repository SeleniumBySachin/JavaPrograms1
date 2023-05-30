package Part3Revision;

import java.util.Scanner;

public class D4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the city name");
		String city=s.nextLine().toUpperCase();
		System.out.println("Enter area name");
		String area=s.nextLine().toUpperCase();
	     char ch=area.charAt(0);
	     String s1=ch+"";
	     if(city.contains(s1)) {
	    	 System.out.println("Yes");
	     }
	     else
	    	 System.out.println("No");
	}

}
