import java.util.ArrayList;

public class P {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add("Sheela");
		ls.add("Leela");
		ls.add("Dinga");
		ls.add("Penga");
		System.out.println(ls);
		
		ArrayList ls1=new ArrayList();
		ls1.add("Dinga");
		ls1.add("Pengi");
		ls1.add("Sheela");
		ls1.add("Dingi");
		ls1.retainAll(ls);
		System.out.println(ls1);
		
	}

}
