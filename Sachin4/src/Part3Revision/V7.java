package Part3Revision;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class V7 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(20, "Sheela");
		h.put(10, "Leela");
		h.put(40, "Dinga");
		h.put(30, "Penga");
		System.out.println(h);
		System.out.println(h.containsValue("Dinga"));
		System.out.println(h.containsKey(10));
		//System.out.println(h.remove(10));
		System.out.println(h.values());
		System.out.println(h.keySet());
		System.out.println(h.entrySet());
		Collection c=h.entrySet();
		for(Object o:c) {
			System.out.println(o);
		}
		System.out.println("================");
		Iterator i=c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		TreeMap t=new TreeMap(h);
		System.out.println(t);
	/*	HashMap h1=new HashMap();
		h1.put(25, "Sheela");
		h1.put(15, "Leela");
		h1.put(45, "Dinga");
		h1.put(35, "Penga");
		System.out.println(h1);
		h.putAll(h1);
		System.out.println(h);*/
	}

}
