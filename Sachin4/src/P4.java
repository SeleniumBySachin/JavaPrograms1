import java.util.HashMap;

public class P4 {
	public static void main(String[] args) {
		HashMap hs=new HashMap();
		hs.put(3, 10);
		hs.put(4, 20);
		hs.put(2, 30);
		for(int i=1;i<=hs.size();i++) {
			System.out.println(hs.get(i));
			
		}
		System.out.println(hs.values());
		System.out.println(hs.keySet());
		System.out.println(hs.entrySet());
	}

}
