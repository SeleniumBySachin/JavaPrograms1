import java.util.TreeMap;

public class P8 {
	public static void main(String[] args) {
		TreeMap hs=new TreeMap();
		hs.put(3, 10);
		hs.put(6, 20);
		hs.put(2, 30);
		hs.put(1,50);
		//System.out.println(hs);
		TreeMap hs1=new TreeMap(hs);
		System.out.println(hs1);
	}

}
