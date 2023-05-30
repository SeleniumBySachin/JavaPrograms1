import java.util.ArrayList;

public class S4 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
	    ls.add(20);	
	    ls.add(10);
	    ls.add(40);
	    ls.add(50);
	    System.out.println(ls);
	    System.out.println(ls.contains(27));
	    
	    ArrayList ls1=new ArrayList();
	    ls1.add(20);	
	    ls1.add(90);
	    ls1.add(40);
	    ls1.add(50);
	    System.out.println(ls.containsAll(ls1));
	    
	    System.out.println(ls.indexOf(50));
	}

}
