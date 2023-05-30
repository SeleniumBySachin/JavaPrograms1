package FinalMockRvision;

import java.util.ArrayList;
import java.util.Collections;

class Watch implements Comparable{
	String name;
	double sal;
	Watch(){}
	public Watch(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Watch [name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Object o) {
		Watch w=(Watch)o;
		return this.name.compareTo(w.name);
	}
}
public class Coll17 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Watch("Titan",1500));
		ls.add(new Watch("Fastrack",700));
		ls.add(new Watch("Sonata",300));
		ls.add(new Watch("HMT",100));
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		
	}

}
