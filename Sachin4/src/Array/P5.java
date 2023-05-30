package Array;

import java.util.Objects;

public class P5 {
	int a;
	double b;
	P5(){}
	public P5(int a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "P5 [a=" + a + ", b=" + b + "]";
	}
	public boolean equals(Object o) {
		P5 p1=(P5)o;
	 return this.a==p1.a &&
			 this.b==p1.b;
	}
public static void main(String[] args) {
	   Object o=new Object();
	   System.out.println(o);
	   P5 p=new P5(10,20);
	   System.out.println(p);
	   P5 p1=new P5(10,20);
	   System.out.println(p1);
	   System.out.println(o.equals(p));
	   System.out.println(p.equals(p1));
	   P5 p2=new P5();
	   P5 p3=new P5();
	   System.out.println(p2.equals(p3));
	   
	   
	   
	   
   }

}
