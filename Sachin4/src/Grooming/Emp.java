package Grooming;

public class Emp {
	int eid;
	String name;
	double sal;
	Emp(){}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	public Emp(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}

}
