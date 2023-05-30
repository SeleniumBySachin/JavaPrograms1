package FinalMockRvision;

public class String10 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Sheela");
		//s.append("Leela");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.indexOf("e"));
		System.out.println(s.substring(4));
		System.out.println(s.substring(1, 5));
	//	System.out.println(s.reverse());
		System.out.println(s.delete(0, 3));
		System.out.println(s);
		System.out.println(s.deleteCharAt(2));
		System.out.println(s);
	}

}
