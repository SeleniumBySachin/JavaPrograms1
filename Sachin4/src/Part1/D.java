package Part1;
class Emp2{
	String eid;
	static String cname="QSP";
	double sal;
	String name;
	static int count=100;
	{
		eid=cname+count++;
	}
	Emp2(){}
	Emp2(double a,String b){
	         sal=a;
	         name=b;
	}
	void display() {
		System.out.println(eid);
		System.out.println(name);
		System.out.println(sal);
		System.out.println("=========");
	}
}
public class D {
   public static void main(String[] args) {
	Emp2 e1=new Emp2(20000,"Sheela");
	e1.display();
	Emp2 e2=new Emp2(10000,"Leela");
	e2.display();
	Emp2 e3=new Emp2(15000,"Dinga");
	e3.display();
	
}
}
