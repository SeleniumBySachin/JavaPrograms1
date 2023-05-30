import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Emp{
	int eid;
	String name;
	double sal;
	Emp(){}
	public Emp(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class S8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of emp to be store");
		int size=s.nextInt();
		ArrayList ls=new ArrayList();
		for(int i=0;i<size;i++) {
			System.out.println(i+1+" :enter the emp name");
			s.nextLine();
			String name=s.nextLine();
			System.out.println("enter the emp id");
			int eid=s.nextInt();
			System.out.println("enter emp sal");
			double sal=s.nextDouble();
			Emp e=new Emp(eid,name,sal);
			ls.add(e);
		}
		Iterator i = ls.iterator();
		while(i.hasNext()) {
			Emp e=(Emp)i.next();
			if(e.eid==101) {
				i.remove();
			}
		}
		System.out.println(ls);
	}

}
