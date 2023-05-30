package FinalMockRvision;

import java.util.ArrayList;
import java.util.Iterator;

class Book{
	String name;
	double price;
	Book(){}
	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	public Book(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
}
public class Coll8 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList() ;
		ls.add(new Book("Java",400));
		ls.add(new Book("Selenium",500));
		ls.add(new Book("Sql",300));
		ls.add(new Book("MT",200));
		System.out.println(ls);
		Iterator i = ls.iterator();
		while(i.hasNext()) {
			Book b=(Book)i.next();
			if(b.name.equalsIgnoreCase("sql")) {
				i.remove();
			}
		}
		System.out.println(ls);
			
		
	}

}
