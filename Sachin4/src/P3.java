import java.util.HashMap;

public class P3 {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(1, 10);
		hs.put(2, 20);
		hs.put(3, 30);
		System.out.println(hs.put(1, 10));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		hs.clear();
		System.out.println(hs);
	}

}
