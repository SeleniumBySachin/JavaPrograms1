package Part3Revision;

import java.util.Arrays;

class Emp1 implements Comparable{
	int eid;
	String name;
	double sal;
	Emp1(){}
	public Emp1(int eid, String name, double sal) {
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
		
		Emp1 e=(Emp1)o;
		if(this.sal>e.sal)
			return 1;
		if(this.sal<e.sal) 
			return -1;
		
			else
				return 0;
	}
	
}
public class S3 {
	public static void main(String[] args) {
		Emp1[]e1=new Emp1[4];
		e1[0]=new Emp1(102,"Sheela",4000);
		e1[1]=new Emp1(104,"Leela",3000);
		e1[2]=new Emp1(101,"Dinga",1000);
		e1[3]=new Emp1(103,"Arun",2000);
	for(int i=0;i<e1.length;i++) {
		System.out.println(e1[i]);
	}
		Arrays.sort(e1);
		System.out.println("After sorting");
		for(int i=0;i<e1.length;i++) {
			System.out.println(e1[i]);
		}
		
	}

}
