package Grooming;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {
public static void main(String[] args) {
	HashMap hs=new HashMap();
	hs.put(4, "Sheela");
	hs.put(3, "Leela");
	hs.put(1, "Dinga");
	hs.put(2, "Penga");
	hs.put(4 , "Channa");
	System.out.println(hs);
	TreeMap ts=new TreeMap(hs);
	System.out.println(ts);
	Set s = ts.entrySet();
	for(Object o:s) {
		System.out.println(o);
	}
}
	
	
}