package GroomingClass;

class B1{
	void test() {
		System.out.println("SQL");
	}
}


class B extends B1{
	void test() {
		//super.test();
		System.out.println("JAVA");
	}
}


public class RunTImePolymorphism {
	public static void main(String[] args) {
		B obj=new B();
		obj.test();
		B1 obj1=obj;
		obj.test();
		
	}
}
