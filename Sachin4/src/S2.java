import java.util.ArrayList;

public class S2 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
	    ls.add(20.0);	
	    ls.add(10);
	    ls.add('A');
	    ls.add("Sheela");
	    System.out.println(ls);
	    
	    
	    ArrayList ls1=new ArrayList();
	    ls1.addAll(ls);
	    ls1.add(130);
	    System.out.println(ls1);
	    
	}

}
