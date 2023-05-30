import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp2 implements Serializable{
	String name;
	double sal;
	@Override
	public String toString() {
		return "Emp2 [name=" + name + ", sal=" + sal + ", eid=" + eid + "]";
	}
	int eid;
	Emp2(){}
	public Emp2(String name, double sal, int eid) {
		super();
		this.name = name;
		this.sal = sal;
		this.eid = eid;
	}
}
public class P13 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//serialization
		FileOutputStream fos=new FileOutputStream("D://Selenium/QACM4/h1.txt");
		ObjectOutputStream obj=new ObjectOutputStream(fos);
		obj.writeObject(new Emp2("Sheela",20000,101));
		System.out.println("Added");
		
		//Deserialization
		System.out.println("Accessing");
		FileInputStream fis=new FileInputStream("D://Selenium/QACM4/h1.txt");
		ObjectInputStream obj1=new ObjectInputStream(fis);
	    Object read = obj1.readObject();
	    System.out.println(read);
	}

}
