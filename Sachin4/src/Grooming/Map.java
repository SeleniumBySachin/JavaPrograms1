package Grooming;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Map {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(4, "Sheela");
		hs.put(3, "Leela");
		hs.put(1, "Dinga");
		hs.put(2, "Penga");
		hs.put(4 , "Channa");
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.containsKey(2));
		System.out.println(hs.containsValue("Channa"));
	  //System.out.println(hs.remove(1));
	  //System.out.println(hs.remove(2, "Leela"));
	  //hs.clear();
		System.out.println(hs.get(1));
		System.out.println(hs.values());
		System.out.println(hs.keySet());
		System.out.println(hs.entrySet());
		
		Collection s=hs.values();
	    Iterator i= s.iterator();
		while(i.hasNext()) {
          System.out.println(i.next());
           }
		TreeMap ts=new TreeMap(hs);
		System.out.println(ts);

		}
		
		
	}


