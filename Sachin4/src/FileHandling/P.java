package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class P {
	public static void main(String[] args) throws IOException {
		String path="D:\\Java eclipse\\src\\FileHandling\\t.txt";
		FileOutputStream f= new FileOutputStream(path);
		String s="Sheela is a imaginary girl ";
		for(int i=0;i<s.length();i++) {
			f.write(s.charAt(i));
		}
		String s1="Leela";
		byte[]b=s1.getBytes();
		f.write(b);
	}

}
