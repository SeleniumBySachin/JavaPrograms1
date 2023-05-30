package Part3Revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fill3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("D://Selenium/QACM4/f2.txt");
		String s="Prithvin is a gangstar";
		byte[] bytes = s.getBytes();
		f.write(bytes);
		System.out.println("Added");
		FileInputStream fin=new FileInputStream("D://Selenium/QACM4/f2.txt");
		byte[] b = new byte[fin.available()];
		fin.read(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print((char)b[i]);
		}
				
		
				}

}
