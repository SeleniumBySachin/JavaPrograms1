package Part1;
//WAJP to print details of an object with the help of constructor
class Pen{
	String name;
	double price;
	String color;
	Pen(){}
	public Pen(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		System.out.println("Pen name : "+name);
		System.out.println("Pen price: "+price);
		System.out.println("Pen color: "+color);
		}
	void display() {
		System.out.println("Pen name : "+name);
		System.out.println("Pen price: "+price);
		System.out.println("Pen color: "+color);
		System.out.println("===================");
	}
}
public class D5 {
	public static void main(String[] args) {
		Pen p1=new Pen("cello",10,"Blue");
	//	p1.display();
		Pen p2=new Pen("flair",15,"Black");
	//	p2.display();
		Pen p3=new Pen("Nataraja",7,"Red");
	//	p3.display();
		Pen p4=new Pen("Writometer",25,"Green");
	//	p4.display();
	}

}
