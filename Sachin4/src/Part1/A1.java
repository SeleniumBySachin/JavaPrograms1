package Part1;
class Emp{
	String eid;
	String name;
	double sal;
	static String company="QSP";
	static int count=100;
	{
		eid=company+count++;
	}
	public Emp( String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	Emp(){}
	void display() {
		System.out.println("Emp id: "+eid);
		System.out.println("Emp name: "+name);
		System.out.println("EMp sal: "+sal);
	}
}
public class A1 {
	public static void main(String[] args) {
		Emp e1=new Emp("Sheela",10000);
		Emp e2=new Emp("Leela",2000);
		e1.display();
		e2.display();
	}

}
