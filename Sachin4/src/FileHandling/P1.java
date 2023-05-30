package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class P1 {
	public static void main(String[] args) throws IOException {
		String path="D:\\Java eclipse\\src\\FileHandling\\t1.txt";
		FileOutputStream f=new FileOutputStream(path);
		String s="Sachin is a god of cricket";
		for(int i=0;i<s.length();i++) {
			f.write(s.charAt(i));
		}
		/*String s1="Sheela";
		byte[]b=s1.getBytes();
		f.write(b);*/
		
		
	}

}
