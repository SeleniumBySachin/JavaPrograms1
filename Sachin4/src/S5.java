import java.util.ArrayList;

public class S5 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(20);	
		ls.add(10);
		ls.add(40);
		ls.add(50);
		System.out.println(ls);
		
		ArrayList ls1=new ArrayList();
		ls1.add(70);	
		ls1.add(10);
		ls1.add(40);
		ls1.add(60);
		System.out.println(ls1);
	   ls.retainAll(ls1);
	   System.out.println(ls);
		
	}

}
