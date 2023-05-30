package FinalMockRvision;

import java.util.Arrays;
import java.util.Scanner;

class Emp implements Comparable{
	int eid;
	double sal;
	String name;
	Emp(){}
	Emp(int eid,double sal,String name){
		this.eid=eid;
		this.sal=sal;
		this.name=name;
	}
	public String toString() {
		return eid+" "+sal;
	}
	public boolean equals(Object o) {
		Emp e=(Emp)o;
		return this.eid==e.eid&&
				this.sal==e.sal&&
				this.name==e.name;
	}
	public int hashCode() {
		int hc=0;
		hc+=eid;
		hc+=sal;
		hc+=name.hashCode();
		return hc;

	} 
	public int compareTo(Object o) {
		  Emp e=(Emp)o;
		  return this.name.compareTo(e.name);
	}
	


}
public class A1{
	public static void main(String[] args) {
		Emp obj=new Emp(101,1000,"Sheela");
		Emp obj1=new Emp(100,1000,"Leela");
		System.out.println(obj);
		System.out.println(obj==obj1);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		/*Object o1=new Emp(102,2000,"Dinga");
		System.out.println(o1.sal);*/

	}

}