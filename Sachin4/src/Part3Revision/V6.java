package Part3Revision;

import java.util.ArrayList;

public class V6 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		Object[]a=ls.toArray();
		for(Object o:a) {
			System.out.println(o);
		}
	}

}
