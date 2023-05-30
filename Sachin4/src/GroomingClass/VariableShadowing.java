package GroomingClass;
class A{
	int a=10;
	static void test() {
		System.out.println("SQL");
	}
}
class A1 extends A{
	int a=20;
	static void test() {
		System.out.println("JAVA");
	}
}
public class VariableShadowing {
	public static void main(String[] args) {
		A1 obj=new A1();
		obj.test();
		A obj1=obj;//upcasting
		obj1.test();
		System.out.println(obj.a);
		System.out.println(obj1.a);
		A1 obj2=(A1)obj1;//Downcasting
		System.out.println(obj2.a);
		obj2.test();
	}

}
