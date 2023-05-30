package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable{
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
	void display() {
		System.out.println("Emp eid: "+eid);
		System.out.println("Emp name: "+name);
		System.out.println("Emp sal: "+sal);
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}

public class Driver1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path="D:\\Java eclipse\\src\\FileHandling\\t3.txt";
		FileOutputStream fos=new FileOutputStream(path);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(new Emp(101,"Sheela",30000));
		oos.writeObject(new Emp(102,"Leela",40000));
		System.out.println("Object is successfully added");
		System.out.println("The emp objects are :");
		FileInputStream fis=new FileInputStream(path);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Emp e1=(Emp)ois.readObject();
		e1.display();
		System.out.println(e1);
		System.out.println("======================");
		Emp e2=(Emp)ois.readObject();
		e2.display();
		System.out.println(e2);
		
		
		
	}

}
