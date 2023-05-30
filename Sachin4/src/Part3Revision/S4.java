package Part3Revision;

import java.util.Arrays;
import java.util.Comparator;
 
class SortByName implements Comparator{
	public int compare(Object o1,Object o2) {
		Emp2 e1=(Emp2)o1;
		Emp2 e2=(Emp2)o2;
		/*if(e1.sal>e2.sal)
			return 1;
		if(e1.sal<e2.sal)
			return -1;
		else
			return 0;*/
		return e1.name.compareTo(e2.name);
	}
}

class Emp2 {
	int eid;
	String name;
	double sal;
	Emp2(){}
	public Emp2(int eid, String name, double sal) {
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
public class S4 {
	public static void main(String[] args) {
		Emp2[]e1=new Emp2[4];
		e1[0]=new Emp2(102,"Sheela",4000);
		e1[1]=new Emp2(104,"Leela",3000);
		e1[2]=new Emp2(101,"Dinga",1000);
		e1[3]=new Emp2(103,"Arun",2000);
	for(int i=0;i<e1.length;i++) {
		System.out.println(e1[i]);
	}
		Arrays.sort(e1,new SortByName());
		System.out.println("After sorting");
		for(int i=0;i<e1.length;i++) {
			System.out.println(e1[i]);
		}
		
	}

}
