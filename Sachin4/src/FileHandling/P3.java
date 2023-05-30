package FileHandling;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int sid;
	String name;
	String loc;
	Student(){}
	public Student(int sid, String name,String loc) {
		super();
		this.sid = sid;
		this.name = name;
		this.loc=loc;
	}
	void display() {
		System.out.println(sid);
		System.out.println(name);
		System.out.println(loc);
	}
	
}
public class P3 {
	public static void main(String[] args)throws Exception {
		String path="D:\\Java eclipse\\src\\FileHandling\\t2.txt";
		FileOutputStream f=new FileOutputStream(path);
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(new Student(101,"Sheela","Basavanagudi"));
		
	}

}
