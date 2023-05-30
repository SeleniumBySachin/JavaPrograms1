package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class P4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path="D:\\Java eclipse\\src\\FileHandling\\t2.txt";
		FileInputStream f=new FileInputStream(path);
		ObjectInputStream o=new ObjectInputStream(f);
		Student s=(Student)o.readObject();
		System.out.println(s.sid);
		System.out.println(s.name);
		System.out.println(s.loc);
		f.close();
		o.close();
	}

}
