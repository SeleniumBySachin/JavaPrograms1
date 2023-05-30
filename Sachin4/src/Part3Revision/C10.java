package Part3Revision;

import java.util.ArrayList;

class Book{
	String name;
	double price;
	Book(){}
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
}
public class C10 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Pen("Maths",2000));
		ls.add(new Pen("Science",15000));
		ls.add(new Pen("Social",1000));
		ls.add(new Pen("Hindi",800));
		System.out.println(ls);
		for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}
		System.out.println("=======================");
		for(int i=0;i<ls.size();i++) {
			
			Pen b1=(Pen)ls.get(i);
			if(b1.name.equals("Hindi")) {
				System.out.println(b1+": index is: "+ls.indexOf(b1));
			}
       	}
	}

}
