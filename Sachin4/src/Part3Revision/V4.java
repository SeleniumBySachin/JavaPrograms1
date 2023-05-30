package Part3Revision;

import java.util.ArrayList;

public class V4 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		for(Object o:ls) {
		int a=(int)o;
		if(a==20) {
			ls.set(0, 100);
		}
		
		}
		System.out.println(ls);
	}

}
