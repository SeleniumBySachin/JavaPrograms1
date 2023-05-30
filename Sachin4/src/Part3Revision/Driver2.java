package Part3Revision;

class NegativeSalaryException extends Exception{
	
}
class Employee{
	int eid;
	String name;
	double sal;
	Employee(){}
	public Employee(int eid, String name, double sal) throws NegativeSalaryException {
		super();
		this.eid = eid;
		this.name = name;
		if(sal>0) {
			this.sal=sal;
		}
		else
		throw new NegativeSalaryException();
	}
	void display() {
		System.out.println("Eid: "+eid);
		System.out.println("Name: "+name);
		System.out.println("Sal: "+sal);
	}
}
public class Driver2 {
	public static void main(String[] args) throws NegativeSalaryException {
		Employee e1=new Employee(101,"Sheela",-10000
				);
		e1.display();
	}
	

}
