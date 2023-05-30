package FinalMockRvision;

import java.util.HashSet;
import java.util.Iterator;

public class Coll20 {
	public static void main(String[] args) {
		 HashSet hs=new HashSet();
		 hs.add(10);
		 hs.add("Sheela");
		 hs.add('A');
		 hs.add(40.0);
		 hs.add(10);
		Iterator i = hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(Object o:hs) {
			System.out.println(o);
		}
		
		
		
	}

}
