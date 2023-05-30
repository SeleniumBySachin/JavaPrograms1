import java.util.HashMap;

public class P5 {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(3, 10);
		hs.put(4, 20);
		hs.put(2, 30);
		System.out.println(hs.remove(4));
		System.out.println(hs);
	}

}
