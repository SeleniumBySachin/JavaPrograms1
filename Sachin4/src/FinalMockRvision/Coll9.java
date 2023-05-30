package FinalMockRvision;

import java.util.ArrayList;
import java.util.ListIterator;

public class Coll9 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ListIterator i = ls.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("=====");
		for(Object o:ls) {
			System.out.println(o);
		}
		System.out.println("======");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
	}

}
