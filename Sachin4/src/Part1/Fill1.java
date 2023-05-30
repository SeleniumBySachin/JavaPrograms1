package Part1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Watch implements Serializable{
	String name;
	double price;
	Watch(){}
	public Watch(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Watch [name=" + name + ", price=" + price + "]";
	}
	
}
public class Fill1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path="D://Selenium/QACM4/d.txt";
		FileOutputStream fil=new FileOutputStream(path);
		ObjectOutputStream o1=new ObjectOutputStream(fil);
		o1.writeObject(new Watch("Sonata",4000));
		System.out.println("Added");
		FileInputStream fi=new FileInputStream(path);
		ObjectInputStream o2=new ObjectInputStream(fi);
		Object a = o2.readObject(); 
	}

}
