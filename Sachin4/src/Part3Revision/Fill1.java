package Part3Revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Fill1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path="D://Selenium/QACM4/f1.txt";
		FileOutputStream f=new FileOutputStream(path);
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(new Pen("flair",10));
		o.writeObject(new Pen("cello",15));
		//System.out.println("Successfully added");
		FileInputStream fin=new FileInputStream(path);
		ObjectInputStream o1=new ObjectInputStream(fin);
		Object r = o1.readObject();
		System.out.println(r);

	}

}
