package FinalMockRvision;

import java.util.ArrayList;

public class Coll3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ArrayList ls1=new ArrayList();
		ls1.add(15);
		ls1.add(20);
		ls1.add(35);
		ls1.add(40);
		//System.out.println(ls.removeAll(ls1));
		//System.out.println(ls.retainAll(ls1));
		ls.clear();
		ls1.clear();
		System.out.println(ls);
		System.out.println(ls1);
	}

}
