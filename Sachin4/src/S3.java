import java.util.ArrayList;

public class S3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
	    ls.add(20);	
	    ls.add(10);
	    ls.add(40);
	    ls.add(50);
	    System.out.println(ls);
	    ls.add(1, 100);
	    System.out.println(ls);
	    
	    ArrayList ls1=new ArrayList<>();
	    ls1.add('a');
	    ls1.add('b');
	    ls1.add('c');
	    System.out.println(ls1);
	    System.out.println("===========");
	    
	    ls.addAll(2, ls1);
	    System.out.println(ls);
	
	}

}
