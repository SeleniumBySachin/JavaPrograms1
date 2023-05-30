package Part3Revision;

import java.util.ArrayList;
import java.util.ListIterator;

public class V3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ListIterator i=ls.listIterator();
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==10) {
				i.set(90);
			}
		}
		System.out.println(ls);
	}

}
