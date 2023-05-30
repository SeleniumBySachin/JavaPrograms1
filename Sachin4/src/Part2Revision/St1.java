package Part2Revision;

public class St1 {
	String eid;
	String name;
	static String cname="QSP";
	static int count=100;
	{
		eid=cname+ count++;
	}
	St1(){}
	public St1( String name) {
		this.name = name;
	}
	void display() {
		System.out.println("Name: "+name);
		System.out.println("Eid: "+eid);
	}
	public static void main(String[] args) {
		 St1 obj=new St1("Sheela");
		 obj.display();
		 St1 obj1=new St1("Leela");
		 obj1.display();
		 St1 obj2=new St1("Dinga");
		 obj2.display();
		 St1 obj3=new St1("Penga");
		 obj3.display();
	}

}
