package FinalMockRvision;

import java.util.ArrayList;
import java.util.ListIterator;

public class Coll10 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ListIterator i = ls.listIterator();
	/*	while(i.hasNext()) {
			int a=(int)i.next();
			if(a==20) {
				i.add(100);
			}
		}*/
		System.out.println(ls);
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==10) {
				i.remove();;
			}
		}
		System.out.println(ls);
	}

}
