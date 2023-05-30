package Array;

public class S5 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Sheela");
		StringBuilder s1=new StringBuilder("Leela");
		System.out.println(s.capacity());
		s.append(s1);
		System.out.println(s);
		System.out.println(s.reverse());
		System.out.println();
	}

}
