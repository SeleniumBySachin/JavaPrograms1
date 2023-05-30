import java.util.HashMap;

public class P2 {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(1, 10);
		hs.put(2, 20);
		hs.put(3, 30);
		hs.put(1, 50);
		System.out.println(hs);
		System.out.println("===========");
		HashMap hs1=new HashMap();
		hs1.put(4, 40);
		hs1.put(7, 70);
		hs1.put(6, 60);
		hs1.put(8, 80);
		System.out.println(hs1);
		hs1.putAll(hs);
		System.out.println("============");
		System.out.println(hs1);
	}

}
