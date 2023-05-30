package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class P2 {
	public static void main(String[] args) throws IOException {
		String path="D:\\Java eclipse\\src\\FileHandling\\t1.txt";
		FileInputStream f=new FileInputStream(path);
		
		System.out.println(f.available());
		/*while(f.available()!=0) {
			System.out.print((char)f.read());
		}*/
		System.out.println(f.available());
		byte[]b=new byte[f.available()];
		f.read(b);
		System.out.println(b);
		for(int i=0;i<b.length;i++) {
			System.out.print((char)b[i]);
		}
		
	}

}
