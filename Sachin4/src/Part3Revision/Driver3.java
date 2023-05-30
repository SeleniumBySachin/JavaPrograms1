package Part3Revision;

import java.util.ArrayList;
import java.util.Scanner;

class Watch{
	String name;
	double price;
	String color;
	Watch(){}
	public Watch(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Watch [name=" + name + ", price=" + price + ", color=" + color + "]";
	}
	
}
public class Driver3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no watch to be store");
		int size=s.nextInt();
		ArrayList ls=new ArrayList();
		for(int i=0;i<size;i++) {
			System.out.println("Enter name");
			String name=s.nextLine();
			s.nextLine();
			System.out.println("Enter color");
			String color=s.nextLine();
			System.out.println("Enter price");
			double price=s.nextDouble();
			Watch w=new Watch(name,price,color);
			ls.add(w);
		}
		System.out.println(ls);
	}

}
