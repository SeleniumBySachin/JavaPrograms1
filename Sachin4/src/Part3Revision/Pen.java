package Part3Revision;

import java.io.Serializable;

public class Pen implements Serializable {
	String name;
	double price;
	Pen(){}
	public Pen(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen [name=" + name + ", price=" + price + "]";
	}

	
}
