package FinalMockRvision;

import java.util.ArrayList;
import java.util.Iterator;

public class Coll6 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		Iterator i = ls.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Iterator i1 = ls.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}

}
