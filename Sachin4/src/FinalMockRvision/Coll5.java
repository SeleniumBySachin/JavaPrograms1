package FinalMockRvision;

import java.util.ArrayList;

class Pen{
	String color;
	double price;
	@Override
	public String toString() {
		return "Pen [color=" + color + ", price=" + price + "]";
	}
	Pen(){}
	public Pen(String color, double price) {
		super();
		this.color = color;
		this.price = price;
	}

}
public class Coll5 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Pen("Blue",20));
		ls.add(new Pen("Green",30));
		ls.add(new Pen("Black",25));
		ls.add(new Pen("Red",15));
		for(int i=0;i<ls.size();i++) {
			Pen p=(Pen)ls.get(i);
			/*if(p.color=="Black") {
				System.out.println(ls.indexOf(p));

			}*/

			System.out.println(p.price*1.3);
		}

		System.out.println(ls);
	}

}
