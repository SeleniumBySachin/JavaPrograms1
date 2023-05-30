package FinalMockRvision;

import java.util.ArrayList;
import java.util.ListIterator;

public class Coll12 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		for(Object o:ls) {
			int a=(int)o;
			if(a==20) {
				ls.set(1, 100);
			}
		}
		System.out.println(ls  );
		
	}

}
