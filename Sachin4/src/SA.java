import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SA {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new FileOutputStream("D://Selenium/QACM4/h.txt");
		//f.write(122);
		String s="Sheela is a imaginary girl";
		byte[] b = s.getBytes();
		f.write(b);
		System.out.println("Added");
		System.out.println("Accessing");
		FileInputStream fis=new FileInputStream("D://Selenium/QACM4/h.txt");
		byte[]b1=new byte[fis.available()];
		 fis.read(b1);
		 for (int i = 0; i < b1.length; i++) {
			System.out.print((char)b[i]);
		}
		
	
	}

}
