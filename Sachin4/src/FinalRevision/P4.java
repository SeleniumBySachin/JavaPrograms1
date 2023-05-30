package FinalRevision;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class P4 {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(null, null);
		System.out.println(hs);
		TreeMap ts=new TreeMap();
		ts.put(10, "Sheela");
		ts.put(30, null);
		//ts.put(null, 20);
		System.out.println(ts);
		
		Hashtable t=new Hashtable();
		t.put(1,"Sheela");
		t.put('A', 20);
		t.put("Leela", 'Z');
		t.put(10,30);
		System.out.println(t);
	}

}
