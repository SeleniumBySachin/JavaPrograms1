package Array;

import java.util.Arrays;

class Emp implements Comparable{
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
	public int compareTo(Object o) {
		Emp e1=(Emp)o;
		if(this.eid>e1.eid)
			return 1;
		else if(this.eid<e1.eid)
			return -1;
		else
			return 0;
	}
	
}
public class Driver1 {
	public static void main(String[] args) {
		Emp[]e=new Emp[3];
		e[0]=new Emp(102,"Sheela",2000);
		e[1]=new Emp(103,"Leela",1000);
		e[2]=new Emp(101,"Dinga",5000);
		Arrays.sort(e);
		
		for (int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
		}
	}

}
