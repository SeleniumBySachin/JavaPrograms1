package Part3Revision;

import java.util.ArrayList;

public class C5 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		int key=40;
		if(ls.contains(key)) {
			System.out.println(key+" : is present in : "+ls.indexOf(key));
		}
		else
			System.out.println(key+" : is not present");
	}

}
