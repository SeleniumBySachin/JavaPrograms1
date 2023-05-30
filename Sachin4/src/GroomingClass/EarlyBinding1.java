package GroomingClass;
class Laces{
	String color;
	void tie() {
		System.out.println("Tie up the lace");
	}
	public Laces(String color) {
		super();
		this.color = color;
	}
	Laces(){}
}


class Shoe{
	String brand;
	double price;
	Laces l1;
	void running() {
		System.out.println("Ready for 100 meter race");
		l1=new Laces("Black");
	}
	Shoe(){}
	public Shoe(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	void display() {
		System.out.println("Brand :"+brand);
		System.out.println("Price :"+price);
	}
}


public class EarlyBinding1 {
	public static void main(String[] args) {
		Shoe s=new Shoe("Puma",15000);
		s.running();
		s.l1.tie();
		s.display();
		System.out.println("Color :"+s.l1.color);
	}

}
