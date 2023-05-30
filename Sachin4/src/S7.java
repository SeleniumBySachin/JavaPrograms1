import java.util.ArrayList;
import java.util.Iterator;

public class S7 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20);	
		ls.add(10);
		ls.add(40);
		ls.add(50);
		Iterator i = ls.iterator();
	/*	while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		for(Object i1:ls) {
			System.out.println(i1);
			
		}
	}

}
