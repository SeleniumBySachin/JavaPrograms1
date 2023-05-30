package Grooming;

import java.util.Scanner;

public class ValidationOfUsername {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the username");
		String name=s.nextLine();
		int upp=0;
		int low=0;
		int spl=0;
		int digit=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch>='A'&&ch<'Z')
				upp++;
			else if(ch>='a'&&ch<='z')
				low++;
			else if(ch>='0'&&ch<='9')
				digit++;
			else
				spl++;
		}
		/*System.out.println("upp: "+upp);
		System.out.println("low: "+low);
		System.out.println("spl: "+spl);
		System.out.println("digit: "+digit);*/
		if(name.length()>=8) {
			if(upp>=1&&low>=1&&spl>=1&&digit>=2) {
				System.out.println("user name is valid");
			}
			else
				System.out.println("username is invalid");
			
		}else
			System.out.println("Enter minimum 8 char");
	}

}
