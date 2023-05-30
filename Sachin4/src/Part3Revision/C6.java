package Part3Revision;

import java.util.ArrayList;

public class C6 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		ls.remove(Integer.valueOf(10));
		System.out.println(ls);
	}

}
