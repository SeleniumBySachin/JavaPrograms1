package Part3Revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fill2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("D://Selenium/QACM4/f2.txt");
		f.write(500);
		System.out.println("Added");
		System.out.println("Reading");
		FileInputStream fin=new FileInputStream("D://Selenium/QACM4/f2.txt");
		int read = fin.read();
		System.out.println((char)read);
	}

}
