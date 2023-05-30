package Part3Revision;

import java.util.ArrayList;

public class C3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ls.add(2,100);
		System.out.println(ls);
		System.out.println("=======");
		ArrayList ls1=new ArrayList();
		ls1.add(15);
		ls1.add(25);
		ls1.add(35);
		ls1.add(45);
		System.out.println(ls1);
		ls.addAll(2,ls1);
		System.out.println(ls);
	}

}
