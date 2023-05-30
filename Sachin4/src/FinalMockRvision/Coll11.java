package FinalMockRvision;

import java.util.ArrayList;
import java.util.ListIterator;

public class Coll11 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ListIterator i = ls.listIterator();
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==30) {
				i.set(100);
			}
		}
		System.out.println(ls);
	}

}
