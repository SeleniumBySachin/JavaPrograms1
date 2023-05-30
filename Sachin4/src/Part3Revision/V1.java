package Part3Revision;

import java.util.ArrayList;
import java.util.Iterator;

public class V1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		Iterator i=ls.iterator();
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==20) {
				i.remove();
			}
		}
		System.out.println(ls);
	}

}
