package Part3Revision;

import java.util.Objects;

class A{
	String name;
	double price;
	A(){}
	public A(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public int hashCode() {
		int hc=0;
		 hc+=price;
		 hc+=name.hashCode();
		 return hc;
		
		
	}
	@Override
	public boolean equals(Object o) {
		A a=(A)o;
		return this.price==a.price &&
				this.name==a.name;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", price=" + price + "]";
	}
	
}
public class AC {
	public double price;

	public static void main(String[] args) {
		A a=new A("LG",1000);
		A a1=new A("LG",1000);
		System.out.println(a==a1);
		System.out.println(a.equals(a1));
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a.hashCode()==a1.hashCode());
		
	}

}
