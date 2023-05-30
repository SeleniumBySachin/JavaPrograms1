import java.util.ArrayList;
import java.util.Scanner;

public class S6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		ArrayList ls=new ArrayList();
		ls.add(20);	
		ls.add(10);
		ls.add(40);
		ls.add(50);
		System.out.println("enter the searched element");
		int key=s.nextInt();
		if(ls.contains(key)) {
			System.out.println(key+" yes it is present in index of: "+ls.indexOf(key));
		}else {
			System.out.println(key+" it is not present");
		}
	}

}
