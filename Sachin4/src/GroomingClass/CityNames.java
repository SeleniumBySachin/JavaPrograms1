package GroomingClass;

import java.util.Scanner;

public class CityNames {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of cities   to be store");
		int size=s.nextInt();
		String []city=new String[size];
		System.out.println("Enter the city names");
		s.nextLine();   
		for (int i = 0; i < city.length; i++) {
			city[i]=s.nextLine();
		}
		System.out.println("Cities present inside the array");
		for (int i = 0; i < city.length; i++) {
			if(i%2==1)
				System.out.println(city[i]);
			
		}
	}

}
