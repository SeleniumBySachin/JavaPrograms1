package Part1;

import java.util.Arrays;

class Emp3 implements Comparable{
	String name;
	int eid;
	Emp3(){}
	public Emp3(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Emp3 [name=" + name + ", eid=" + eid + "]";
	}
	public int compareTo(Object o) {
		Emp3 obj=(Emp3)o;
		if(this.eid>obj.eid)
			return 1;
		else if(this.eid<obj.eid)
			return -1;
		else
			return 0;
	}
	
}


public class Driver4 {
	public static void main(String[] args) {
		Emp3[]obj1=new Emp3[3];
		System.out.println("Hi");
		obj1[0]=new Emp3("Sheela",103);
		obj1[1]=new Emp3("Leela",101);
		obj1[2]=new Emp3("Dinga",102);
		Arrays.sort(obj1);
		for(int i=0;i<obj1.length;i++) {
			System.out.println(obj1[i]);
		}
		
	}

}
