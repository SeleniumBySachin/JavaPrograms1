package Part3Revision;

import java.util.ArrayList;

public class C1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ArrayList ls1=new ArrayList();
		ls1.add(15);
		ls1.add(25);
		ls1.add(35);
		ls1.add(45);
		System.out.println(ls1);
		ls.addAll(ls1);
		System.out.println(ls);
		System.out.println(ls1);
	}

}
