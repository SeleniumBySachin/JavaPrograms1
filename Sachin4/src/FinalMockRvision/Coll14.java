package FinalMockRvision;

import java.util.ArrayList;
import java.util.List;

public class Coll14 {
	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		ArrayList ls=toList(a);
		System.out.println(ls);
	}
	public static ArrayList toList(int[]a) {
		ArrayList ls=new ArrayList();
		for(int b:a) {
			ls.add(b);
		}
		return ls;
	}

}
