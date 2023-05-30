package Part2Revision;

import java.security.DomainCombiner;

interface I{
	void test();
}

interface R1{
	void print();
}
public class M implements I ,R1{
	public void test() {
		System.out.println("Bye");
	}
	public void print() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		M obj=new M();
		I obj1=obj;
		obj1.test();
		R1 obj2=obj;
		obj2.print();
		
		I obj3=(I)obj2;
		obj3.test();
		
		R1 obj4=(R1)obj3;
		obj4.print();
	}

}
