package Array;

public class String1 {
	public static void main(String[] args) {
		String s="Sheela";
		String s1=new String("Sheela");
		String s2="Leela";
		s1.concat(s2);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
