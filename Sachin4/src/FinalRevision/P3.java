package FinalRevision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class P3 {
	public static void main(String[] args) {
		int[]a= {20,30,10,50,10,40};
		ArrayList ls=new ArrayList();
		for(int i=0;i<a.length;i++) {
			ls.add(a[i]);
		}
		HashSet hs=new HashSet(ls);
		System.out.println(ls);
		System.out.println(hs);
		TreeSet ts=new TreeSet(ls);
		System.out.println(ts);
	}

}
