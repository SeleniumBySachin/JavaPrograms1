package Array;
class Car{
	String name;
	double price;
	String color;
	Car(){}
	public Car(String name, double price, String color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public String toString() {
		return "Car name: "+name+" Car price:"+price+" Car color: "+color;
	}
	public boolean equals(Object o) {
		Car c=(Car)o;
		return this.name==c.name &&
				this.price==c.price&&
				this .color==c.color;
	}
	public int hashCode() {
		int hc=0;
		hc=hc+(int)price;
		hc+=name.hashCode();
		hc+=color.hashCode();
		return hc;
	}
	
	
}
public class ObjectClass {
	public static void main(String[] args) {
		Car c=new Car("BMW",1000,"Blue");
		Car c1=new Car("BMW",1000,"Blue");
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c==c1);
		System.out.println(c.equals(c1));
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		
	}
	

}
