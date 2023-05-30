package Part1;

public class D1 {
	String name;
	double price;
	public D1(String name, double price) {
		this();
		System.out.println(name);
		System.out.println(price);
	}
	D1(){System.out.println("Hi");}
	D1(String name){
		this(name,2000);
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		D1 obj=new D1("Sheela");
	}

}
