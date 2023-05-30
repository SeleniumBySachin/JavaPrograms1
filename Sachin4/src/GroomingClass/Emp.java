package GroomingClass;
//WAJP which will show constructor chaining within the class
public class Emp {
	String name;
	double sal;
	int eid;
	String address;
	Emp(){
		System.out.println("Loading.......!");
	}
	Emp(String name,double sal,int eid,String address){
		this(name,sal,eid);
		this.address=address;
	}
	Emp(String name,double sal,int eid){
		this(name,sal);
		this.eid=eid;
	}
	Emp(String name,double sal){
		this(name);
		this.sal=sal;
	}
	Emp(String name){
		this();
		this.name=name;
	}
	public static void main(String[] args) {
		Emp e1=new Emp("Sheela",20000,101,"Basavanagudi");
	}

}
