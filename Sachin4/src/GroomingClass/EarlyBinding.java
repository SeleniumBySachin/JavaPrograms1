package GroomingClass;
class FanBlade{
	String color;
	FanBlade(){}
	FanBlade(String color){
		this.color=color;
	}
	void cooling() {
		System.out.println("Turn on the fan");
	}
	@Override
	public String toString() {
		return "FanBlade [color=" + color + "]";
	}
	
}
class Fan{
	
	double price;
	String brand;
	FanBlade b=new FanBlade("Grey");
	Fan(){}
	Fan(String brand,double price){
		this.brand=brand;
		this.price=price;
	}
	void display() {
		System.out.println("Brand :"+brand);
		System.out.println("Price :"+price);
	}
	
}
public class EarlyBinding {
	public static void main(String[] args) {
		Fan f=new Fan("Havels",12000);
		f.b.cooling();
		f.display();
		System.out.println(f.b.color);
		System.out.println(f.b);
		
	}

}
