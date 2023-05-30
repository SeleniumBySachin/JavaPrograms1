package Part3Revision;

import java.util.Objects;

class P10{
	int i;
	int j;
	P10(){}
	public P10(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "P10 [i=" + i + ", j=" + j + "]";
	}
	public boolean equals(Object o) {
		P10 p=(P10)o;
		return this.i==p.i&&
				this.j==p.j;
	}
	public int hashCode() {
		int hc=0;
		 hc=hc+i;
		 hc=hc+j;
		 return hc;
		 
		 
	}
}
public class P {
	public static void main(String[] args) {
		P10 p=new P10(10,20);
		P10 p1=new P10(10,20);
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p1.hashCode()==p.hashCode());
	}

}
