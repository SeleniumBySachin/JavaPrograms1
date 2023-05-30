package Part3Revision;

public class S9 {
	String name="Sheela";
	int eid=101;
	double sal=10000;
	S9(){}
	public S9(String name, int eid, double sal) {
		super();
		this.name = name;
		this.eid = eid;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "S9 [name=" + name + ", eid=" + eid + ", sal=" + sal + "]";
	}
	public static void main(String[] args) {
	    S9 s=new S9();
	    System.out.println(s);
	}
	
}
